package com.Wayne_07;

import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        //创建TreeSet集合对象，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<Student>();

        //创建学生对象
        Student s1 = new Student("Wayne", 85, 95);
        Student s2 = new Student("瑞克", 74, 100);
        Student s3 = new Student("莫迪", 66, 88);

        Student s4 = new Student("荷鲁斯", 67, 87);
        Student s5 = new Student("基利曼", 67, 87);

        //把学生对象添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath() + "," + s.getSum());
        }
    }
}
