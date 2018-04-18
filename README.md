###  cf-service项目说明

#### 结构

+ sp-patrol: 单独的服务包

+ patrol-object: 服务对应的业务实现

+ pom.xml: 基础依赖，具体服务包会继承这个pom的依赖，不要重复引用

  > 服务包和业务实现包以子项目形式存在，如机构中的`sp-patrol`和`patrol-object`


#### 子项目的结构
```markdown
- common  			公共部分
- contanst			常量等基本定义
- webservice		服务接口
	-restful		服务接口restful
	-soap			服务接口soap
```

#### maven打包使用

```
mvn clean install:将打包的jar添加到仓库（本地）
mvn clean package: 打包
```

