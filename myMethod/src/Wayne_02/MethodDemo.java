package Wayne_02;
/*
    带参数方法的定义和调用

    定义格式：
        public static void 方法名（参数） { ... ... }

    调用格式：
        方法名（参数）;
*/
public class MethodDemo  {
    public static void main(String[] args) {
        //常量值的调用
        isEvenNnumber(8,16);

        //变量的调用
        int number1 = 8;
        int number2 = 16;
        isEvenNnumber(number1, number2);
    }

    //需求：定义一个方法，该方法接受一个参数，判断该数据是否是偶数
    public static void isEvenNnumber(int number1, int number2) {
        if(number1 % 2 == 0) {
            System.out.println("number1:"+"偶数");
        } if(number2 % 2 == 0) {
            System.out.println("number2:"+"偶数");
        } else {
            System.out.println(false);
        }
    }
}
