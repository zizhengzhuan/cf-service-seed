---
**!!!提示：此文档仅供参考，部分描述不正确，清以研发群的文档为准。**
---

<h2 align="center"> Cole-flowers项目说明</h2>

## 前言

　　项目的最红的发布与运行依然是基于cityserver，这个项目种子文件提供的是：maven管理和持久层换为mybaties，将spring的特性引进来使用；同时对项目结构和规范形成约束。

## 一、结构

+ sp-demo: 单独的服务包

+ demo-object: 服务对应的业务实现

+ pom.xml: 基础依赖，具体服务包会继承这个pom的依赖，不要重复引用

  > 环境统一使用IntelliJ IDEA 作为开发工具；
  > 服务包和业务实现包以子项目形式存在。


## 二、子项目的结构

### 2.1 命名规范

* 服务包以`sp-`开头，如`sp-demo`；
* 服务实现包以`-object`结尾，如`demo-object`;
* 服务包的基础报名前缀为`com.zzht.service.xxxx`；
* 业务实现包的报名前缀为`com.zzht.component.xxxx`;

示例代码：

```java
//#1.服务包
pakacge com.zzht.service.demo.common;
//......
//....

// #2.实现包
pakacge com.zzht.service.demo.webservice
//....
//....

```

### 2.2 sp服务包代码结构

```markdown
## main
- common  			公共部分
	- ServiceCore	实现IService，，用来secore发布服务
- contanst			常量等基本定义
- exception			异常或者返回的消息定义
- webservice		        服务接口
	-restful		服务接口restful
	-soap			服务接口soap
## resource
- Service.xml			服务发布依赖的bean
- Service-REST-http.xml	 REST服务地址绑定
- Service-SOAP-http.xml  SOAP服务地址绑定
```

### 2.3 object实现包结构

``` markdown
## main
- api			jdk级别的API调用，包含逻辑实现层
- common		公共部分抽离
- dao			数据访问层
- entity		实体类
- exception	自定义异常
## resource
- sqlmaps				mybaties数据访问配置文件目录
	- XxxxMapper.xml	mapper配置
- spring/sprig-mabaties.xml	mybaties与spring集成配置
```



### 2.4 maven打包使用

```
mvn clean install:将打包的jar添加到仓库（本地）
mvn clean package: 打包
```

### 2.5应用的配置文件

##### 1. 全局配置文件

　　应用的配置文件统一放在`ServiceEngine/conf`里面，`application.yml`，也允许自己项目增加额外配置的文件，非必要情况下不推荐。

​	[YAML规范](http://www.ruanyifeng.com/blog/2016/07/yaml.html)（**尤其注意缩进和冒号之后的空格**）

​	[YAML校验](https://codebeautify.org/yaml-validator)

文件application.yml

```yaml
## 数据库配置
###数据库类型：mysql、mssql、oracle

### driverClassName
### mysql:com.mysql.jdbc.Driver
### mssql:com.microsoft.sqlserver.jdbc.SQLServerDriver
### oracle:oracle.jdbc.driver.OracleDriver

## 基础数据库配置
db: &base1
  type: mssql
  driver: com.microsoft.sqlserver.jdbc.SQLServerDriver
  url: jdbc:sqlserver://192.168.8.183:1433;DatabaseName=cole_flower
  username: zzht
  password: zzht
  initialSize: 0
  maxActive: 200
  maxIdle: 20
  minIdle: 1
  maxWait: 6000
  
db2: &base2
  type: mysql
  driver: com.mysql.jdbc.Driver
  url: jdbc:mysql://localhost:3306:test
  username: zzht
  password: zzht
  initialSize: 0
  maxActive: 200
  maxIdle: 20
  minIdle: 1
  maxWait: 6000

##具体的项目配置文件可以直接引用基本数据库配置
oms: *base1
form: *base2
```

##### 2.与spring集成

```xml
<!--省略其他....-->
<bean id="yamlProperties" class="org.springframework.beans.factory.config.YamlPropertiesFactoryBean">
        <property name="resources" value="conf/application.yml"/>
    </bean>
    <context:property-placeholder properties-ref="yamlProperties" ignore-unresolvable="true"/>
```

##### 3.JAVA获取配置

+ 获取所有配置(Properties)：`AppConfig.Init(homePath).getApplicationProperties()`
+ 按照前缀获取：`getApplicationProperties("oms",false/true)`
+ `AppConfig`依赖`cole-flower-common-1.0.0-RELEASE.jar`

##### 4.workspace使用配置文件

```java
	Properties props = AppConfig.Init(homePath).getApplicationProperties();
        String dbType = props.getProperty("oms.type");
        String dbUrl = props.getProperty("oms.url");
        String name = props.getProperty("oms.username");
        String psw = props.getProperty("oms.password");
        String minIdle =props.getProperty("oms.minIdle");
        String maxIdle =props.getProperty("oms.maxIdle");
        int minnum = minIdle==null?1:Integer.valueOf(minIdle);
        int maxnum = maxIdle==null?1:Integer.valueOf(maxIdle);

        if(dbType.equalsIgnoreCase("mssql")) {
            dbType = "sql";
        }
        // 从jdbcUrl提取地址和数据库
        dbUrl = URLUtil.extractAddressAndDatabase(dbUrl);
		//.....其他的和之前没有区别
//===========分割线:按照前缀获取==========
//参数：(String prefix,boolean keyWithPrefix)
//如果keyWithPrefix=true连同前缀一起返回,props不含前缀
Properties props = AppConfig.Init(homePath).getApplicationProperties("oms");
String dbType = props.getProperty("type");
// ohthers.....
```



### 2.6  本地调试环境配置

[此部分主要用于指导TOMCAT 8.x 环境下的本地调试环境配置，需以截图和实际的环境相结合]
## 环境 
Windows 10
JDK 1.8
Tomcat 8.0
前置条件，在调试运行项目之前需要了解基础的CityServer基础知识，准备基础运行环境和配置文件，[后续会上传基础配置文件]



[PREPARE] 
配置ServiceEngine的web.xml, 需要配置MyBatis配置文件和筛选器，如下图

**私有与spring的集成都放在spring下面，classpath:/spring/*.xml**

![](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-prepare.png) 
![](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step0.png) 


**[STEP1]**
IDEA调试工具栏中编辑调试配置，选择Edit Configurations
![](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step1.png) 

**[STEP2]**
选择Tomcat Server，点击绿色 **+** 号
![](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step2.png) 

**[STEP3]**
Tomcat IDEA下有 local 和 remote 两种模式，选择local 
![](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step3.png) 

**[STEP4]**
添加一个新的Tomcat Server 名称，添加Deployment，选择Artifact,然后按照下列截图配置相关的参数
![4](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step4.png) 
![5](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step5.png) 
![6](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step6.png) 
![7](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step7.png) 
将相应的模块输出到指定的目录下，（项目的pom.xml中已经指定了lib输出路径，这里只需输出或复制自己所需的内容）
由于service不是默认的webservice目录，所以需要将自己的服务复制到对应的目录
![8](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step8.png) 
![9](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step9.png) 


**[STEP5]**
填写Application Context，目前约定使用ServiceEngine
![](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step10.png) 

**[STEP6]**
在调试选项的下拉项中选择我们刚添加的服务
![](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step11.png) 

**[STEP7]**
配置数据库路径，启动服务，服务启动成功后在浏览器输入
![](http://localhost:8080/ServiceEngine/restful/person/queryPerson)
![](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step13.png) 
![](https://github.com/zizhengzhuan/cf-service-seed/raw/master/art/tomcat-debug-config-step14.png) 

之后有代码修改时，只需要mvn install ，不必要再次重启tomcat

