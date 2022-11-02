package com.Wayne_07;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求：用TreeSet集合存储多个学生信息（姓名，语文成绩，数学成绩），并遍历该集合
    要求：按照总分从高到低出现

    思路：
        1：定义学生类
        2：创建TreeSet集合对象，通过比较器排序进行排序
        3：创建学生对象
        4：把学生对象添加到集合
        5：遍历集合
*/
public class TreeSetDemo {
    public static void main(String[] args) {
        //创建TreeSet集合对象，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
//                int num = (s2.getChinese() + s2.getMath())-(s1.getChinese() + s1.getMath());
                //主要排序
                int num = s2.getSum() - s1.getSum();
                //次要排序
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });

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
