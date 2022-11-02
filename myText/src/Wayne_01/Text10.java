package Wayne_01;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/*
    需求：
        在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整分数。
        选手的最后得分为：去掉一个最高分和一个最低分后的4个评委平均值（不考虑小数部分）。

    思路：
        1：定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        2：键盘录入评委分数
        3：由于是6个评委打分，所以，接收评委分数的操作，用循环改进
        4：定义方法实现获取数组中的最高分（数组最大值），调用方法
        5：定义方法实现获取数组中的最低分（数组最小值），调用方法
        6：定义方法实现获取数组中中的所有元素的和（数组元素求和），调用方法
        7：按照计算规则进行计算得到平均分
        8：输出平均分
*/
public class Text10 {
    public static void main(String[] args) {

        //定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        int[] arr = new int[6];

        //键盘录入评委分数
        Scanner sc = new Scanner(System.in);
        //由于是6个评委打分，所以，接收评委分数的操作，用循环改进
        for (int x = 0; x < arr.length; x++) {
            System.out.println("请输入第" + (x + 1) + "个评委的打分 ：");
            arr[x] = sc.nextInt();
            if (arr[x] < 0 || arr[x] > 100) {
                System.out.println("你输入的数据有误");
            }
        }
        //数组最大值
        int max = getMax(arr);
        //数组最小值
        int min = getMin(arr);
        //数组元素求和
        int sum = getSum(arr);

        //去掉一个最高分和一个最低分后的4个评委平均值（不考虑小数部分）
        int fs = (sum - max - min) / 4;

        //输出平均分
        System.out.println("选手的最后得分为：" + fs);

    }

    //定义方法实现获取数组中的最高分（数组最大值），调用方法
    /*
        两个明确：
            返回值类型：int
            参数： int[] arr
    */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int a = 1; a < arr.length; a++) {
            if (arr[a] > max) {
                max = arr[a];
            }
        }
        return max;
    }

    //定义方法实现获取数组中的最低分（数组最小值），调用方法
    /*
         两个明确：
            返回值类型：int
            参数： int[] arr
    */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int b = 1; b < arr.length; b++) {
            if (arr[b] < min) {
                min = arr[b];
            }
        }
        return min;
    }

    //定义方法实现获取数组中中的所有元素的和（数组元素求和），调用方法
    /*
         两个明确：
            返回值类型：int
            参数： int[] arr
    */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int c = 0; c < arr.length; c++) {
            sum += arr[c];
        }
        return sum;
    }
}
