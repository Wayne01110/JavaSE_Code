package com.Wayne_annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
    目标完成注解的解析
*/
public class AnnotationDemo03 {
    @Test
    public void parseMethod() throws NoSuchMethodException {
        // a.先得到类对象
        Class c = BookStore.class;
        Method m = c.getDeclaredMethod("test");
        // b.判断这个类上面是否存在这个注解
        if (m.isAnnotationPresent(Bookk.class)) {
            // c.直接获取该注解对象
            Bookk book = (Bookk) m.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));

        }

    }
}

@Bookk(value = "《空白》", price = 99.9, author = {"Wayne", "无"})
class BookStore {
    @Bookk(value = "《华音流韵》", price = 99.9, author = {"步非烟"})
    public void test() {

    }
}

