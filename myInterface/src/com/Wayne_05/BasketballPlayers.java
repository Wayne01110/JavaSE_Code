package com.Wayne_05;

public class BasketballPlayers extends Player {
    public BasketballPlayers() {
    }

    public BasketballPlayers(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学篮球");
    }
}
