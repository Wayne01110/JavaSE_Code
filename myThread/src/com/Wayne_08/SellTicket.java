package com.Wayne_08;

public class SellTicket implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();

    //在SellTicket类中重写run()方法实现卖票，代码步骤如下

    @Override
    public void run() {
        while (true) {
            //tickets = 100;
            //t1,t2,t3
            //假设t1抢到了CPU的执行权
            //假设t2抢到了CPU的执行权
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                        //t1休息100毫秒
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //一号窗口正在出售第100张票
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--; //tickets = 99;
                }
            }
            //t1出来了，这段代码的锁就被释放了
        }
    }
}
