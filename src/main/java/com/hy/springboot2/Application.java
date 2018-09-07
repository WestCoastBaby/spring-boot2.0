package com.hy.springboot2;

import com.entity.Person;

import java.util.*;
import java.util.function.BinaryOperator;

//@SpringBootApplication
public class Application {

    //
    private static BinaryOperator<String> a = (x, y) -> x + y;


    public static void main(String[] args) {
        ArrayList<String> ss = new ArrayList<>();
        ss.add("0");
        ss.add("1");
        ss.add("2");
        ss.add("3");
        ss.add(2, "a");
        ss.remove(3);

        ss.forEach(o -> a.apply(o, o));
        System.out.println(ss.size());
    }


//    public void sy() {
//        lock.lock();
//        System.out.println("进入sy");
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("出了sy");
//        lock.unlock();
//    }
//
//    public void sy1() {
//        lock.lock();
//        System.out.println("进入sy1");
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("出了sy1");
//        lock.unlock();
//    }

    class ss {
        void print() {
            System.out.println(this);
        }
    }

}
