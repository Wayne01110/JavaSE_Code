package com.Wayne_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
    需求：
        创建一个储存学生对象的集合，储存3个学生对象的集合，使用程序实现在控制台遍历该集合

    思路：
        1：定义学生类
        2：创建ArrayList集合对象
        3：创建学生对象
        4：把学生添加到集合
        5：遍历集合
            迭代器：集合特有的遍历方式
            普通for:带索引的遍历方式
            增强for；最方便的遍历方式
*/
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建ArrayList集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("Wayne", 25);
        Student s2 = new Student("瑞克", 77);
        Student s3 = new Student("莫迪", 12);

        //把学生添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历集合
        //迭代器：集合特有的遍历方式
        Iterator<Student> it = array.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");

        //普通for:带索引的遍历方式
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");

        //增强for；最方便的遍历方式
        for (Student s : array) {
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");


        //创建LinkedList集合对象
        LinkedList<Student> list = new LinkedList<Student>();

        //把学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历集合
        //迭代器：集合特有的遍历方式
        Iterator<Student> it1 = list.iterator();
        while (it1.hasNext()) {
            Student s = it1.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");

        //普通for:带索引的遍历方式
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");

        //增强for；最方便的遍历方式
        for (Student s : list) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
