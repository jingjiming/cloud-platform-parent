package com.css.cloud.cloudservice.demo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableScheduling //开启定时任务
@EnableAsync
@ComponentScan(basePackages = {"com.css"})
@MapperScan(basePackages = {"com.css.**.mapper"})
@EnableEurekaClient
public class CloudServiceDemo01Application extends SpringBootServletInitializer implements CommandLineRunner {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CloudServiceDemo01Application.class);
    }

    @Override
    public void run(String... args) {
        System.out.println(">>>>>>>>>>>>>>>>>> cloud-service-demo01 服务启动成功！>>>>>>>>>>>>>>>>>>>");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceDemo01Application.class, args);
    }
}
