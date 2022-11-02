package com.Wayne_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    练习：通过反射实现如下操作
        Student s = new Stuent();
        s.name = "林青霞";
        s.age = 30;
        s.address = "西安";
        System.out.println(s);
*/
public class RellectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //获取Class对象
        Class<?> c = Class.forName("com.Wayne_02.Student");

        //Student s = new Stuent();
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

        //s.name = "林青霞";
        Field nameField = c.getDeclaredField("name");
        //s.age = 30;
        Field ageField = c.getDeclaredField("age");
        //s.address = "西安";
        Field addressField = c.getField("address");

        nameField.setAccessible(true);
        ageField.setAccessible(true);

        nameField.set(obj, "林青霞");
        ageField.set(obj, 30);
        addressField.set(obj, "西安");

        System.out.println(obj);
    }
}
