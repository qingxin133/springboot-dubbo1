# SpringBoot与Dubbo整合-application.properties和注解的方式
dubboApi api接口定义<br>
dubboProducer 生产者<br>
dubboConsumer 消费者<br>

导入dubbo-starter，在application.properties配置属性，使用@Service注解来暴露服务，使用@Reference来引用服务。具体可参考 Dubbo整合SpringBoot，这里截取部分代码方便理解。
属性在application.properties中配置
服务提供方使用@Service注解暴露服务
服务消费方使用@Reference注解来引用服务
