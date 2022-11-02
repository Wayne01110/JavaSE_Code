package com.Wayne_03_factory_pattern;

/*
    工厂设计模式的作用：
        1、对象通过工厂的方法创建返回，工厂的方法可以为该对象进行加工和数据注入。
        2、可以实现类与类之间的解耦操作（核心思想，重点）

    小结：
        工厂模式的思想是提供一个工厂方法返回对象！
*/
public class FactoryDemo {
    public static void main(String[] args) {
        Computer c1 = FactoryPattren.creatComuter("huawei");
        c1.start();

        Computer c2 = FactoryPattren.creatComuter("mac");
        c2.start();
    }
}
