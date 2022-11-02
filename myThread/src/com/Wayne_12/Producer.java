package com.Wayne_12;

public class Producer implements Runnable {
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }


    //实现Runnable接口，重写run()方法，调用存储牛奶的操作
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.put(i);
        }
    }
}
