package com.Wayne_12;

public class Box {
    //定义一个成员变量，表示第x瓶奶
    private int mile;
    //定义一个成员变量，表示奶箱的状态
    private boolean state = false;

    //提供存储牛奶和获取牛奶的操作
    public synchronized void put(int mile) {
        //如果有牛奶，等待消费
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //如果没有牛奶，就生成牛奶
        this.mile = mile;
        System.out.println("送奶工将第" + this.mile + "瓶奶放入奶箱");

        //生产完毕之后，修改奶箱状态
        state = true;

        //唤醒其他等待的线程
        notifyAll();
    }

    public synchronized void get() {
        //如果没有牛奶，等待生产
        if(!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //如果有牛奶，就消费牛奶
        System.out.println("用户拿到第" + this.mile + "瓶奶");

        //消费完毕之后，修改奶箱状态
        state = false;

        //唤醒其他等待的线程
        notifyAll();
    }
}
