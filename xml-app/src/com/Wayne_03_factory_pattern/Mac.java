package com.Wayne_03_factory_pattern;

public class Mac extends Computer {
    @Override
    public void start() {
        System.out.println(getName() + "以非常优雅的方法启动了，展示了一个苹果logo");
    }
}
