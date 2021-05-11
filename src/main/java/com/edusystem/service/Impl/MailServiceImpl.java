package com.edusystem.service.Impl;

import com.edusystem.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

@Service
public class MailServiceImpl  {

    @Autowired
    private JavaMailSender mailSender;

    /**
     * 用来发送模版邮件
     */
    @Autowired
    private TemplateEngine templateEngine;

    @Value("${spring.mail.username}")
    private String from;

    @Async
    public void sendToTeacherList(List<Teacher> teacherlist, String subject, String text) {
        for(Teacher t : teacherlist){

//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom(from);
//        message.setTo(to);
//        message.setSubject(subject);
//        message.setText(text);

            Context context = new Context();
            context.setVariable("project", "通知");
            context.setVariable("author", "管理员");
            context.setVariable("code", text);

//        TemplateEngine templateEngine = new TemplateEngine();

            String emailContent = templateEngine.process("mail.html", context);

            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = null;
            try {
                helper = new MimeMessageHelper(message, true);
                helper.setFrom("3174815394@qq.com");
                helper.setTo(t.getTeacherEmail());
                helper.setSubject(subject);
                helper.setText(emailContent, true);
//            helper.setText(text);
            } catch (MessagingException e) {
                e.printStackTrace();
            }
            mailSender.send(message);

        }
    }





    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
