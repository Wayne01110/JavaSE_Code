package com.Wayne_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，键是学号（String）,值是学生对象（Student）.存储三个键值对元素，并遍历

    思路：
        1：定义学生类
        2：创建HashMap集合对象
        3：创建学生对象
        4：把学生添加到集合
        5：遍历集合
            方式1：键找值
            方式2：键值对对象找键和值
*/
public class HashMapDemo {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String, Student> map = new HashMap<String, Student>();

        //创建学生对象
        Student s1 = new Student("Wayne", 25);
        Student s2 = new Student("瑞克", 72);
        Student s3 = new Student("莫迪", 12);

        //把学生添加到集合
        map.put("001", s1);
        map.put("002", s2);
        map.put("003", s3);

        //遍历集合
        //方式1：键找值
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Student value = map.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
        System.out.println("--------");

        //方式2：键值对对象找键和值
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String, Student> me : entries) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}
