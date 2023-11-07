package com.css.cloud.cloudservice.demo02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //开启定时任务
@EnableAsync
@ComponentScan(basePackages = {"com.css"})
@MapperScan(basePackages = {"com.css.**.mapper"})
@EnableEurekaClient
@EnableFeignClients("com.css.cloud")
public class CloudServiceDemo02Application extends SpringBootServletInitializer implements CommandLineRunner {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CloudServiceDemo02Application.class);
    }

    @Override
    public void run(String... args) {
        System.out.println(">>>>>>>>>>>>>>>>>> cloud-service-demo02 服务启动成功！>>>>>>>>>>>>>>>>>>>");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceDemo02Application.class, args);
    }
}
