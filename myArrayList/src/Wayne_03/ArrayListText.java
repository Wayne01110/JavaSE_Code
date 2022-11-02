package Wayne_03;

import java.util.ArrayList;
import java.util.Scanner;

/*
    需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        学生的姓名和年龄来自于键盘录入

    思路：
        1：定义学生类，为了键盘录入数据方法，把学生类中的成员变量都定义为String类型
        2：创建集合对象
        3：键盘录入学生对象所需要的数据
        4：创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        5：往集合中添加学生对象
        6：遍历集合，采用通用遍历格式实现
*/
public class ArrayListText {
    public static void main(String[] args) {

        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        /*
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄:");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s1 = new Student();
        s1.setName(name);
        s1.setAge(age);

        //往集合中添加学生对象
        array.add(s1);

        //遍历集合，采用通用遍历格式实现
        for(int i = 0; i < array.size(); i++) {
            Student v = array.get(i);
            System.out.println(s1.getName() + ", " + s1.getAge());
        }
        */

        //为了提高代码的复用性，我们用方法来改进程序
        addStudent(array);
        addStudent(array);
        addStudent(array);

        //遍历集合，采用通用遍历格式实现
        for(int i = 0; i < array.size(); i++) {
            Student s1 = array.get(i);
            System.out.println(s1.getName() + ", " + s1.getAge());
        }
    }

    /*
        两个明确：
            返回值：void
            参数： ArrayList<Student> array
    */
    public static void addStudent(ArrayList<Student> array) {
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄:");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s1 = new Student();
        s1.setName(name);
        s1.setAge(age);

        //往集合中添加学生对象
        array.add(s1);
    }
}
