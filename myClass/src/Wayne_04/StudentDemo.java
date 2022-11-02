package Wayne_04;

/*
    学生测试类
*/
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "林青霞";
        s.setAge(-30);

        //调用show方法
        s.show();
    }
}
