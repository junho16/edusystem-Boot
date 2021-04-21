package com.edusystem.config;

import com.edusystem.Interceptor.JWTInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 * @author 花菜
 * @date 2021/4/2 14:15
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(new JWTInterceptor())
            .addPathPatterns("/**")
            .excludePathPatterns("/login");
    //        registry.addInterceptor(new JWTInterceptor())
    //                .addPathPatterns("/user/test")
    //                .excludePathPatterns("/user/login")
    //        ;
    }
}