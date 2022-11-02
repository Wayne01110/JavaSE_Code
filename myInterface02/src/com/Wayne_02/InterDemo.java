package com.Wayne_02;

/*
    需求：
        1：定义一个接口Inter，里面有三个方法：一个是抽象方法，一个是静默方法，一个是静态方法
            void show();
            default void method(){ }
        2：定义接口的实现类：
            InterImpl
        3：定义测试类：
            InterDemo
            在主方法中，按照多态的方法创建对象并使用
*/
public class InterDemo {
    public static void main(String[] args) {
        //按照多态的方法创建对象并使用
        Inter i = new InterImpl();
        i.show();
        i.method();
//        i.test();
        Inter.test();
//        InterImpl.test();

        Flyable.test();
    }
}