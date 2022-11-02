package com.Wayne_12;

public class Customer implements Runnable {
    private Box b;
    public Customer(Box b) {
        this.b = b;
    }

    //实现Runnable接口，重写run()方法，调用获取牛奶的操作
    @Override
    public void run() {
       while(true) {
           b.get();
       }
    }
}
