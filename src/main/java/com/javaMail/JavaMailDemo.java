package com.javaMail;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * @author hy  on 2018-08
 */
public class JavaMailDemo {

    public static void main(String[] args) throws MessagingException, UnsupportedEncodingException {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost("smtp.qq.com");
        sender.setPort(25);
        sender.setUsername("903651975@qq.com");
        sender.setPassword("blyzsfuwgsjcbfdi");
        sender.setDefaultEncoding("Utf-8");
        Properties p = new Properties();
        p.setProperty("mail.smtp.timeout", "25000");
        p.setProperty("mail.smtp.auth", "true");
        sender.setJavaMailProperties(p);
        MimeMessage mimeMessage = sender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        messageHelper.setFrom("903651975@qq.com", "胡煜");
        messageHelper.setTo("huyu9036@dingtalk.com");
        messageHelper.setSubject("123");
        messageHelper.setText("<p>qwe</p>", true);
        sender.send(mimeMessage);
    }
}
