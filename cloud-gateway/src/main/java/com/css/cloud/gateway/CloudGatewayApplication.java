package com.css.cloud.gateway;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
public class CloudGatewayApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(">>>>>>>>>>>>>>>>>> cloud-gateway 服务启动成功！>>>>>>>>>>>>>>>>>>>");
    }

}
