package com.Wayne_03;

public class Dog extends Animal implements Jumpping {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗跳高");
    }
}