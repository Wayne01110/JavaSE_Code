package com.Wayne_07;

/*
    卖票案例的思考
*/
public class SellTicketDemo {
    public static void main(String[] args) {
        //创建SellTicket类的对象
        SellTicket st = new SellTicket();

        //创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        Thread t1 = new Thread(st,"一号窗口");
        Thread t2 = new Thread(st,"二号窗口");
        Thread t3 = new Thread(st,"三号窗口");

        //启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
