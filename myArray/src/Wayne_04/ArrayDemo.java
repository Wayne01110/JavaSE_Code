package Wayne_04;
/*
    索引越界：访问了数组中不存在的索引对应元素，造成索引越界问题
        ArrayIndexOutOfBoundsException
    空指针异常：访问的数组已经不再指向堆内存的数据，造成空指针异常
        NullPointerException
    null:空值，引用数据类型的默认值，表示不指向任何有效对象
*/
public class ArrayDemo {
    public static void main(String[] args) {

        //System.out.println(arr[3]);索引越界 ArrayIndexOutOfBoundsException
        //System.out.println(arr[2]);

        //把null赋值给数组
        int[] arr = null;//空值，引用数据类型的默认值，表示不指向任何有效对象
        System.out.println(arr[2]);//空指针异常 NullPointerException
    }
}
