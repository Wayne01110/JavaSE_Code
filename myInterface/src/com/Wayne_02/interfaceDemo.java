package com.Wayne_02;

/*
    测试类
*/
public class interfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 20;
        System.out.println(i.num);
//        i.num = 40;
        System.out.println(i.num2);
        System.out.println(Inter.num);
    }
}
