package com.Wayne_05;

import java.util.TreeSet;

/*
    储存学生对象并遍历，创建集合使用无参构造方法
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
*/
public class TreeSetDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<>();

        //创建学生对象
        Student s1 = new Student("Wayne", 25);
        Student s2 = new Student("瑞克", 72);
        Student s3 = new Student("莫迪", 12);
        Student s4 = new Student("V", 28);

        Student s5 = new Student("J", 25);
        Student s6 = new Student("J", 25);
        //添加到集合里
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
