package Wayne_03;

import java.util.Scanner;

/*
    需求：
        已知用户名和密码，请用程序实现模拟用户登录。登陆后，给出相应的提示

    思路：
        1：已知用户名和密码，定义两个字符串表示即可
        2：键盘录入要登陆的用户名和密码，用Scanner实现
        3：拿键盘录入的用户名，密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用equals() 方法实现
        4：用循环实习多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环
*/
public class StringText01 {
    public static void main(String[] args) {

        //已知用户名和密码，定义两个字符串表示即可
        String admin = "wayne";
        String code = "237512610";

        //键盘录入要登陆的用户名和密码，用Scanner实现
        Scanner sc = new Scanner(System.in);

        //用循环实习多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环
        for (int x = 0; x < 3; x++) {
            System.out.println("请输入用户名:");
            String admin01 = sc.nextLine();

            System.out.println("请输入密码:");
            String code01 = sc.nextLine();

            //拿键盘录入的用户名，密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用equals() 方法实现
            if (admin.equals(admin01) && code.equals(code01)) {
                System.out.println("登录成功");
                break;
            } else if (2 - x == 0) {
                System.out.println("你的账户被锁定，请与管理员联系");
            } else if (admin.equals(admin01)) {
                //2, 1, 0
                //x = 0, 1, 2
                System.out.println("你输入的密码有误，你还有" + (2 - x) + "次机会");
            } else {
                System.out.println("你输入的用户名有误，你还有" + (2 - x) + "次机会");
            }
        }
    }
}
