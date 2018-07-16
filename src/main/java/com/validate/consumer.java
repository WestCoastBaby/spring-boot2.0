package com.validate;

import com.hy.springboot2.Application;

/**
 * hy  on 2018/3/23.
 */
public class consumer implements Runnable {

    private Application a ;

    public consumer(Application a) {
        this.a = a;
    }

    @Override
    public void run() {
    }
}
