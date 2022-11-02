package com.Wayne_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    通过反射实现如下的操作：
        Studetn s = new Student("林青霞",30,"西安")
        System.out.println(s);
*/
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("com.Wayne_02.Student");

        //public Student(String name, int age, String address)
        //Constructor<T> getConstructor (Class<?>...parameterTypes)
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        //基本数据类型也可以通过。class得到对应的Class类型

        //T newInstance (Object... initargs)
        Object obj = con.newInstance("林青霞", 30, "西安");
        System.out.println(obj);
    }
}
