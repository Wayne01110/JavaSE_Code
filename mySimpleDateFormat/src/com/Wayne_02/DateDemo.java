package com.Wayne_02;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();

        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);

        String s3 = DateUtils.dateToString(d, "HH:mm:ss");
        System.out.println(s3);
        System.out.println("---------");

        String ss = "2077-08-09 11:11:11";
        Date d2 = DateUtils.stringToDate(ss, "yyyy-MM-dd HH:mm:ss");
        System.out.println(d2);
    }
}



