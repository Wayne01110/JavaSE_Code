package com.one.Layout.BorderLayout;

import java.awt.*;

public class ShowBorderDemo {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayout example");

        //设置布局
        f.setLayout(new BorderLayout());

        //添加按钮
        f.add("East", new Button("东"));
        f.add("South", new Button("南"));
        f.add("West", new Button("西"));
        f.add("North", new Button("北"));
        f.add(new Button("中"));

        //设置窗口对象可见
        f.setVisible(true);

        //设置宽高
        f.setSize(300, 300);
    }
}
