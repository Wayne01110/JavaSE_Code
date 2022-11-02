package Wayne_01;

/*
    需求：输入星期数，显示今天的减肥活动
            周一：跑步
            周二：游泳
            周三：慢走
            周四：动感单车
            周五：拳击
            周六：爬山
            周日：好好吃一顿

     思路：
        1：键盘录入一个星期数，用一个变量接收
        2：对星期进行判断，这里用if语句实现
        3：在对应的语句控制中输出对应的减肥活动
*/

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Text01 {
    public static void main(String[] args) {
        //键盘录入一个星期数，用一个变量接收
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个星期数1-7：");
            int number = sc.nextInt();

            //对星期进行判断，这里用if语句实现
            if (number < 1 || number > 7) {
                System.out.println("你输入的星期数有误");
            } else if (number == 1) {
                System.out.println("周一：跑步");
            } else if (number == 2) {
                System.out.println("周二：游泳");
            } else if (number == 3) {
                System.out.println("周三：慢走");
            } else if (number == 4) {
                System.out.println("周四：动感单车");
            } else if (number == 5) {
                System.out.println("周五：拳击");
            } else if (number == 6) {
                System.out.println("周六：爬山");
            } else {
                System.out.println("周日：好好吃一顿");
            }
        }
    }
}
