package com.edusystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.edusystem.mapper")
public class EdusystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(EdusystemApplication.class, args);
    }

}
