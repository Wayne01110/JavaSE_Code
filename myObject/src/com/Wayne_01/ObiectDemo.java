package com.Wayne_01;

/*
    Obiect 是类层次结构的根，每个类都可以将 Object 作为超类。所有类都直接或者间接的继承该类

    看方法的源码，选中方法，按下Ctrl+B

    建议所有子类重写此方法
    如何重写呢？自动生成即可
*/
public class ObiectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(30);
        System.out.println(s); //com.Wayne_01.Student@4eec7777
        System.out.println(s.toString());
        /*
        public void println(Object x) { //x = s;
            String s = String.valueOf(x);
                if (getClass() == PrintStream.class) {
                    writeln(String.valueOf(s));
                    } else {
                        synchronized (this) {
                          print(s);
                          newLine();
            }
        }
    }

        public static String valueOf(Object obj) { //obj = x;
            return (obj == null) ? "null" : obj.toString();
    }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
        */
    }
}
