package com.Wayne_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    通过反射实现如下的操作
        Student s = new Student("林青霞");
        System.out.println(s);
*/
public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("com.Wayne_02.Student");

        //Constructor<?>[] getDeclaredConstructors ()
        // private Student(String name)
        Constructor<?> con = c.getDeclaredConstructor(String.class);

        //暴力反射
        //public void setAccessible (boolean flag)：值为true，取消访问检查
        con.setAccessible(true);

        Object obj = con.newInstance("林青霞");
        System.out.println(obj);
    }
}
