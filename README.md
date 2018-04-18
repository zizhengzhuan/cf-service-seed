###  cf-service项目说明

#### 结构

+ sp-patrol: 单独的服务包

+ patrol-object: 服务对应的业务实现

+ pom.xml: 基础依赖，具体服务包会继承这个pom的依赖，不要重复引用

  > 服务包和业务实现包以子项目形式存在，如机构中的`sp-patrol`和`patrol-object`

