package com.Wayne_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    定义一个类（ComparatorDemo）,在类中提供两个方法
        一个方法是：Comparator<String> getComparator()
        一个方法是主方法，在主方法中调用getComparartor方法
*/
public class ComparatorDemo {
    public static void main(String[] args) {
        //构造使用的场景

        //定义集合，存储字符串元素
        ArrayList<String> array = new ArrayList<String>();
        array.add("cccc");
        array.add("aa");
        array.add("b");
        array.add("ddd");

        System.out.println("排序前：" + array);

//        Collections.sort(array);
        Collections.sort(array, getComparator());

        System.out.println("排序后：" + array);
    }

    private static Comparator<String> getComparator() {
        //匿名内部类的方法实现
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };

//        return comp;

//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };

//        return (String s1, String s2) -> {
//            return s1.length() - s2.length();
//        };

        return (s1, s2) -> s1.length() - s2.length();

    }

    ;
}

