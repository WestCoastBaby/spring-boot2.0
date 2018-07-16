package com.entity;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * hy  on 2018/4/13.
 */
public class User {

    public interface aInterFace{}

    public interface bInterFace extends aInterFace{}

    private String a;
    private String b;

    private static class ss{

    }

    static private class dd{

    }

    @JsonView(value = aInterFace.class)
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @JsonView(value = bInterFace.class)
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
