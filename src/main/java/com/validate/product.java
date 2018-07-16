package com.validate;

import com.hy.springboot2.Application;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * hy  on 2018/3/5.
 */
public class product implements Runnable {
    private Application a ;

    public product(Application application){
        this.a = application;
    }

    @Override
    public void run() {
    }
}
