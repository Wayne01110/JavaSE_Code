package com.Wayne_05;

public class TableTennisCoach extends Coach implements SpeakEnglish {
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练学英语");
    }
}
