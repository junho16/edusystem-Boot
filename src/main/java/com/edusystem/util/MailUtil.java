package com.edusystem.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 发送邮件工具类
 * 没有用到
 */
public class MailUtil {
//
//    private final static Logger logger = LoggerFactory.getLogger(MailUtil.class);
//
//    /**
//     * 邮件发送
//     * @param mailHost 邮件服务地址
//     * @param fromMail 发件人
//     * @param fromName 发件人名
//     * @param fromMailPwd 发件人密码
//     * @param toMails 收件人，多个用英文逗号分隔
//     * @param mailTitle 邮件标题
//     * @param mailContent 邮件内容
//     * @throws Exception
//     */
//    public static void sendMail(String mailHost, String fromMail, String fromName, String fromMailPwd,
//                                String toMails, String mailTitle, String mailContent) throws Exception {
//        String[] toMailArr = null;
//        if (toMails != null && !toMails.equals("")) {
//            toMailArr = toMails.split(",");
//        } else {
//            throw new Exception("邮件发送人不能为空");
//        }
//
//        // 邮件属性信息
//        Properties props = new Properties();
//        props.put("mail.host", mailHost);
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//
//        Session session = Session.getInstance(props); // 根据属性新建一个邮件会话
//        //session.setDebug(true); // 是否打印调试信息
//        toMailArr = toMails.split(",");
//        for (String to : toMailArr) {
//            MimeMessage message = new MimeMessage(session); // 由邮件会话新建一个消息对象
//            message.setFrom(new InternetAddress(fromMail));// 设置发件人的地址
//            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to, fromName));// 设置收件人,并设置其接收类型为TO
//            message.setSubject(mailTitle);// 设置标题
//            message.setContent(mailContent, "text/html;charset=UTF-8"); // 设置邮件内容类型为html
//            message.setSentDate(new Date());// 设置发信时间
//            message.saveChanges();// 存储邮件信息
//
//            // 发送邮件
//            Transport transport = session.getTransport();
//            transport.connect(fromMail, fromMailPwd);
//            transport.sendMessage(message, message.getAllRecipients());
//            transport.close();
//        }
//    }
//
//    /**
//     * 邮件发送（群发）
//     * @param mailHost 邮件服务地址
//     * @param fromMail 发件人
//     * @param fromName 发件人名
//     * @param fromMailPwd 发件人密码
//     * @param toMails 收件人，多个用英文逗号分隔
//     * @param mailTitle 邮件标题
//     * @param mailContent 邮件内容
//     * @throws Exception
//     */
//    public static void sendGroupMail(String mailHost, String fromMail, String fromName, String fromMailPwd,
//                                     String toMails, String mailTitle, String mailContent) throws Exception {
//        String[] toMailArr = null;
//        if (toMails != null && !toMails.equals("")) {
//            toMailArr = toMails.split(",");
//        } else {
//            throw new Exception("邮件发送人不能为空");
//        }
//
//        // 邮件属性信息
//        Properties props = new Properties();
//        props.put("mail.host", mailHost);
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//
//
//        Session session = Session.getInstance(props); // 根据属性新建一个邮件会话
//        //session.setDebug(true); // 是否打印调试信息
//        MimeMessage message = new MimeMessage(session); // 由邮件会话新建一个消息对象
//        message.setFrom(new InternetAddress(fromMail)); // 设置发件人的地址
//        InternetAddress[] sendTo = new InternetAddress[toMailArr.length];
//        for (int i = 0; i < toMailArr.length; i++) {
//            sendTo[i] = new InternetAddress(toMailArr[i], fromName);
//        }
//        message.setRecipients(Message.RecipientType.TO, sendTo); // 设置收件人,并设置其接收类型为TO
//        message.setSubject(mailTitle); // 设置标题
//        message.setContent(mailContent, "text/html;charset=UTF-8"); // 设置邮件内容类型为html
//        message.setSentDate(new Date()); // 设置发信时间
//        message.saveChanges(); // 存储邮件信息
//
//        // 发送邮件
//        Transport transport = session.getTransport();
//        transport.connect(fromMail, fromMailPwd);
//        transport.sendMessage(message, message.getAllRecipients());
//        transport.close();
//    }
//
//    /**
//     * 读取html文件为String
//     * @param htmlFileName
//     * @return
//     * @throws Exception
//     */
//    public static String readHtmlToString(String htmlFileName) throws Exception{
//        InputStream is = null;
//        Reader reader = null;
//        try {
//            is = MailUtil.class.getClassLoader().getResourceAsStream(htmlFileName);
//            if (is ==  null) {
//                throw new Exception("未找到模板文件");
//            }
//            reader = new InputStreamReader(is, "UTF-8");
//            StringBuilder sb = new StringBuilder();
//            int bufferSize = 1024;
//            char[] buffer = new char[bufferSize];
//            int length = 0;
//            while ((length = reader.read(buffer, 0, bufferSize)) != -1){
//                sb.append(buffer, 0, length);
//            }
//            return sb.toString();
//        } finally {
//            try {
//                if (is != null) {
//                    is.close();
//                }
//            } catch (IOException e) {
//                logger.error("关闭io流异常", e);
//            }
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch ( IOException e) {
//                logger.error("关闭io流异常", e);
//            }
//        }
//    }

}
