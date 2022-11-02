package Wayne_03;

/*
    需求：
        定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
        例如，数组为 int[] arr = {1, 2, 3};，执行方法后的输出结果为：[1, 2, 3]

    思路：
        1：定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
        2：定义一个方法，用于把 int 数组中的数据按照指定格式拼接成一个字符串返回。
           返回值类型 String，参数列表 int[] arr
        3：在方法中用 StringBuilder 按照要求进行拼接，并把结果转成 String 返回
        4：调用方法，用一个变量接收结果
        5：输出结果
*/
public class StringBuliderText01 {
    public static void main(String[] args) {
        //定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
        int[] arr = {1, 2, 3};

        //调用方法，用一个变量接收结果
        String s = number(arr);

        //输出结果
        System.out.println(s);
    }

    //定义一个方法，用于把 int 数组中的数据按照指定格式拼接成一个字符串返回
    /*
        两个明确：
            返回值类型：String
            参数：int[] arr
    */
    public static String number(int[] arr) {
        //在方法中用 StringBuilder 按照要求进行拼接，并把结果转成 String 返回

        StringBuilder s1 = new StringBuilder();

        s1.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s1.append(arr[i]);
            } else {
                s1.append(arr[i]).append(", ");
            }
        }

        s1.append("]");

        String s = s1.toString();

        return s;
    }
}
