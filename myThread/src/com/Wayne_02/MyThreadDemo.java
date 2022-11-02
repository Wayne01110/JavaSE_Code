package com.Wayne_02;

import com.Wayne_01.MyThread;

/*
    Thread类中获取和设置线程名称的方法
        void setName(String name)：将此线程的名称更改为等于参数 name
        String getName()：放回此线程的名称
*/
public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread02 my1 = new MyThread02();
//        MyThread02 my2 = new MyThread02();
//
//        //void setName(String name)：将此线程的名称更改为等于参数 name
//        my1.setName("高铁");
//        my2.setName("飞机");

        //Thread (String name)
//        MyThread02 my1 = new MyThread02("高铁");
//        MyThread02 my2 = new MyThread02("飞机");
//
//        my1.start();
//        my2.start();

        //static Thread currentThread () 放回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }
}
