package com.entity;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * hy  on 2018/3/7.
 */
@Component()
public class Person implements Serializable {

    private static final long serialVersionUID = -1209933572394583693L;
    private final Student student = new Student();

    private final User user = new User();


    public String lockStudent() {
        synchronized (user) {
            System.out.println("lockStudent");
            try {
                TimeUnit.SECONDS.sleep(12);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "OK";
    }


    public Student getStudent() {
        return student;
    }

    public User getUser() {
        return user;
    }
}
