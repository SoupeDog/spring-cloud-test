# spring-cloud-test

调用链查看的服务器参见

https://zipkin.io/pages/quickstart.html

最简洁的
``docker run -d -p 9411:9411 openzipkin/zipkin``

默认配置的 9411 端口，如果端口发生变动，测试用的其他服务的
```
spring.zipkin.base-url
```
得相应修改
