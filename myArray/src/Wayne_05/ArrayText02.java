package Wayne_05;
/*
    获取最值
        获取数组中的最大值
        获取数组中的最小值
*/
public class ArrayText02 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {12,45,98,73,60};

        //定义一个变量，用于保存最大值
        //去数组中第一个数据作为变量的初始值
        int max = arr[0];

        //与数组中剩余的数据逐个比对，每次比对将最大值保存变量中
        for(int x=1; x<arr.length; x++) {
            if(arr[x] > max) {
                max = arr[x];
            }
        }
        //循环结束后打印变量的值
        System.out.println("max:" + max);

        //定义一个变量，用于保存最小值
        //去数组中第一个数据作为变量的初始值
        int min = arr[0];

        //与数组中剩余的数据逐个比对，每次比对将最小值保存变量中
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        //循环结束后打印变量的值
        System.out.println("min:" + min);
    }
}
