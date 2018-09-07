package com.hy.springboot2;

import java.util.Calendar;
import java.util.Date;

/**
 * hy  on 2018/4/24.
 */
public class Main1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println(calendar.getWeekYear());
    }


    private static void function(int base, int workAge) {
        float sum = 0f;
        float preYear = base;
        for (int i = 0; i < workAge; i++) {
            sum = (float) (preYear * 0.7 + sum);
            preYear = (float) (preYear * 1.2);
            preYear = preYear >= 1000 ? 1000 : preYear;
            System.out.print(preYear + "  ");
            System.out.println(sum);
        }
    }
}
