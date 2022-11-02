package com.Wayne_04;


public class AnimalDemo {
    public static void main(String[] args) {

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("---------");

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("---------");

        a = new Dog();
        a.setName("狗");
        a.setAge(4);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("---------");

        a = new Dog("狗", 4);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
    }
}
