package com.Wayne_05;

/*
    测试类
*/
public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        BasketballCoach bc = new BasketballCoach();
        bc.setName("韦恩");
        bc.setAge(24);
        System.out.println(bc.getName() + "," + bc.getAge());
        bc.eat();
        bc.teach();
        System.out.println("----------");

        bc = new BasketballCoach("韦恩", 24);
        System.out.println(bc.getName() + "," + bc.getAge());
        bc.eat();
        bc.teach();
        System.out.println("----------");

        TableTennisCoach tc = new TableTennisCoach();
        tc.setName("杰森");
        tc.setAge(20);
        System.out.println(tc.getName() + "," + tc.getAge());
        tc.eat();
        tc.teach();
        tc.speak();
        System.out.println("----------");

        tc = new TableTennisCoach("杰森", 20);
        System.out.println(tc.getName() + "," + tc.getAge());
        tc.eat();
        tc.teach();
        tc.speak();
        System.out.println("----------");


        BasketballPlayers bp = new BasketballPlayers();
        bp.setName("达米安");
        bp.setAge(12);
        System.out.println(bp.getName() + "," + bp.getAge());
        bp.eat();
        bp.study();
        System.out.println("----------");

        bp = new BasketballPlayers("达米安", 12);
        System.out.println(bp.getName() + "," + bp.getAge());
        bp.eat();
        bp.study();
        System.out.println("----------");

        TableTennisPlayer tp = new TableTennisPlayer();
        tp.setName("知更鸟");
        tp.setAge(22);
        System.out.println(tp.getName() + "," + tp.getAge());
        tp.eat();
        tp.study();
        tp.speak();
        System.out.println("----------");

        tp = new TableTennisPlayer("知更鸟", 22);
        System.out.println(tp.getName() + "," + tp.getAge());
        tp.eat();
        tp.study();
        tp.speak();

    }
}
