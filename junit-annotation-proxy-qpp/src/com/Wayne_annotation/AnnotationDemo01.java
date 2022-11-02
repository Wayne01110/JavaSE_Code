package com.Wayne_annotation;

/*
    目标：学会自定义注解。掌握其定义格式和语法
*/
@MyBook(name = "《JavaSE》", authors = {"Wayne", "dlei"}, price = 199.5)
//@Book(value = "/delete")
@Book("/delete")
public class AnnotationDemo01 {

    @MyBook(name = "《JavaSE2》", authors = {"Wayne", "dlei"}, price = 199.5)
    private AnnotationDemo01() {

    }

    @MyBook(name = "《JavaSE1》", authors = {"Wayne", "dlei"}, price = 199.5)
    public static void main(String[] args) {
        @MyBook(name = "《JavaSE1》", authors = {"Wayne", "dlei"}, price = 199.5)
        int age = 21;
    }
}
