package com.Wayne_03;

/*
    测试类
*/
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println("---------");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲",5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("---------");

        Cat c = new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();
        c.jump();
        System.out.println("---------");

        c = new Cat("加菲",5);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();
        c.jump();
        System.out.println("---------");

        j = new Dog();
        j.jump();
        System.out.println("---------");

        Dog d = new Dog();
        d.setName("狗");
        d.setAge(4);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.jump();
        System.out.println("---------");

        d = new Dog("狗",4);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.jump();
    }
}
