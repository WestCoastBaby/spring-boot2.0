package com.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * hy  on 2018/3/7.
 */
@Component()
public class Person implements Serializable {

    private static final long serialVersionUID = -1209933572394583693L;
    private int age;
    private final Student student = new Student();

    private User user = new User();

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudent() {
        return student;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAge() {
        return age;
    }

    public String lockStudent() {
        synchronized (student){
            System.out.println("lockStudent");
            try {
                TimeUnit.SECONDS.sleep(12);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "OK";
    }
}
