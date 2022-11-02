package com.Wayne_proxy01;

public class Star implements Skill {
    private String name;

    public Star() {
    }

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name+"开始跳舞，跳的很烂");
    }

    @Override
    public void sing() {
        System.out.println(name+"开始唱歌，唱的很烂");
    }
}
