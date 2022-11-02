package com.Wayne_03;

/*
    测试类
*/
public class JumpingDemo {
    public static void main(String[] args) {
        //创建操作对象，并调用方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping jp = new Cat();
        jo.useJumpping(jp);

        Jumpping j = jo.getJumpping();//new Cat()
        j.jump();
    }
}
