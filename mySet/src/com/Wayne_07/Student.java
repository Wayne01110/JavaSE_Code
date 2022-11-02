package com.Wayne_07;

public class Student implements Comparable<Student> {
    private String name;

    private int chinese;

    private int math;

    public Student() {
    }

    public Student(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum() {
        return this.chinese + this.math;
    }

    @Override
    public int compareTo(Student s) {
        int num = s.getSum() - this.getSum();
        int num2 = num == 0 ?this.getName().compareTo(s.getName()):num;
        return num2;
    }
}
