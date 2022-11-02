package com.Wayne_05;


public class TableTennisPlayer extends Player implements SpeakEnglish {
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员学英语");
    }
}
