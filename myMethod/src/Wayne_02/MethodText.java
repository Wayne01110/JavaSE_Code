package Wayne_02;
/*
    需求：
        设计一个方法用于打印两个数中的较大值，数据来自于方法参数

    思路：
        1:定义一个方法，用于打印两个数字中的较大数，例如getMax()
        2:为方法定义两个参数，用于接收两个数字
        3:使用分支语句分两种情况对两个数字的大小关系进行处理
        4:在main()方法中调用定义好的方法(使用常量)
        5：在main()方法中调用定义好的方法(使用变量)
*/
public class MethodText {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法(使用常量)
        getMax(10,20);
        //调用方法的时候，有几个就写几个，是什么类型，就给什么类型

        //在main()方法中使用定义好的方法(使用变量)
        int a = 10;
        int b = 20;
        getMax(a , b);
    }

    //定义一个方法，用于打印两个数字中的较大数，例如getMax()
    //为方法定义两个参数，用于接受两个数字
    public static void getMax(int a, int b) {
        //使用分支语句分两种情况对两个数字的大小关系进行处理
        if(a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
