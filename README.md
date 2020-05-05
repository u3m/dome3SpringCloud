# dome3SpringCloud
## SpringCloud搭建的dome

#### dome-parent 父组件

#### dome-parent-eureka01 注册中心
```cmd
mvn spring-boot:run
```

#### dome-parent-rest-service1 rest服务器提供者service1
```cmd
mvn spring-boot:run -Dspring-boot.run.profiles=dev1
mvn spring-boot:run -Dspring-boot.run.profiles=dev2
```

#### dome-parent-rest-service1 rest服务器提供者service2
```cmd
mvn spring-boot:run
```