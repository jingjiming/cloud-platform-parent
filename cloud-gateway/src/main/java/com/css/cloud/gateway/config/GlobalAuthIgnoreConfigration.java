package com.css.cloud.gateway.config;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "global.auth")
@Setter
public class GlobalAuthIgnoreConfigration {

    /**
     * 忽略URL，List列表形式
     */
    private List<String> ignoreUrl = new ArrayList<>();

    /**
     * 是否启用网关鉴权模式
     */
    private Boolean enable = false;

    /**
     * 监控中心和swagger需要访问的url
     */
    private static final String[] ENDPOINTS = {
            "/swagger-ui.html",// 判断标识，禁止修改删除，如需修改，同时修改getIgnoreUrl()
            "/swagger/api-docs",
            "/swagger-resources/**",
            "/druid/**",//连接池
            "/system/service/audit/login",//登陆
            "/system/service/audit/logout",//注销
            "/system/service/verify",//验证码
            "/system/service/lanxin/authorize",//蓝信授权登录
            "/suggest/service",//群众建言模块
            "/largescreen/business",//大屏统计
            "/cloud/rabbitmq/*",//消息中间件
            "/syslog/service/*"//日志服务
    };

    /**
     * 自定义getter方法，并将ENDPOINTS加入至忽略URL列表
     * @return List
     */
    public List<String> getIgnoreUrl() {
        if (!ignoreUrl.contains("/swagger-ui.html")) {
            Collections.addAll(ignoreUrl, ENDPOINTS);
        }
        return ignoreUrl;
    }

    public Boolean getEnable() {
        return enable;
    }

}


