作者信息：
    @景纪铭
    未经作者同意，请勿擅自传播。
      
版本信息：（v1.0-SNAPSHOT）
    1.jdk：1.8
    2.spring-boot：2.7.8
    3.eureka 3.0.2
    
相关介绍
Eureka是一个Netflix开元的服务发现组件,本身是一个基于REST的服务。它包含Server和Client两部分。
    1.服务注册 每个微服务应用在启动时都会向注册中心登记自己的信息（名称、地址、端口等）；
    2.服务发现 Eureka注册中心中的每个应用都会在本地缓存一份Eureka中所有微服务的信息，客户端调用时，可以通过应用名称找到具体的应用地址进行调用；
     
包结构说明：
 cn.com.css 跟路径
         |--cloudcenter 项目路径

                
框架功能：
    1.eureka 管理端路径
        http://[ip]:[port]/[context-path]

    