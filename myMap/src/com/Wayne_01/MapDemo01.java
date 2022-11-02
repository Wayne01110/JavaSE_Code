package com.Wayne_01;

import java.util.HashMap;
import java.util.Map;

/*
    Map集合概述
        Interface Map<K,V>  K：键的类型； V：值的类型
        将健映射到值的对象; 不能包含重复的键; 每个键可以映射到最多的一个值
        举例：学生的学号和姓名
                wayne001    林青霞
                wayne002    张曼玉
                wayne003    王祖贤

    创建Map集合的对象
        多态的方式
        具体的实现类HashMap
*/
public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //V put (K key, V value) 将指定的值与映射中的指定键相关联
        map.put("wayne001", "林青霞");
        map.put("wayne002", "张曼玉");
        map.put("wayne003", "王祖贤");
        map.put("wayne003", "瑞克");

        //输出集合对象
        System.out.println(map);
    }
}
