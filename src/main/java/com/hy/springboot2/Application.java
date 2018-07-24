package com.hy.springboot2;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.function.BinaryOperator;

//@SpringBootApplication
public class Application {

    //
    private BinaryOperator<Integer> a = (x, y) -> x + y;

    public static void main(String[] args) throws InterruptedException {
//		SpringApplication.run(Application.class, args);
        BufferedImage genbuffer = GenerateImageCode.genbuffer();
        ImageIcon imageIcon = new ImageIcon(genbuffer);

        JFrame jFrame = new JFrame();
        JLabel imgLabel = new JLabel(imageIcon);

        jFrame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
        jFrame.setVisible(true);
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
