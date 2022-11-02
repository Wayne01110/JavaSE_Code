package com.Wayne_04;

/*
    测试类
*/
public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new Genericlmpl<String>();
        g1.show("Wayne");

        Generic<Integer> g2 = new Genericlmpl<Integer>();
        g2.show(30);
    }
}
