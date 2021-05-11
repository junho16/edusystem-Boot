package com.edusystem;

import com.edusystem.service.Impl.MailServiceImpl;
import com.sun.glass.ui.Application;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
class EdusystemApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private MailServiceImpl mailService;

    @Test
    public void testSend() {
//        String to = "1967425586@qq.com";
//        mailService.send(to, "模板邮件", UUID.randomUUID().toString().toUpperCase());
    }

}

