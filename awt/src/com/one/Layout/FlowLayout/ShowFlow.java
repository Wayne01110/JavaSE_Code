package com.one.Layout.FlowLayout;

import java.awt.*;

public class ShowFlow extends Frame {
    public ShowFlow() {
        //从父类中设置窗口名
        super("FlowLayout example");
        //设置宽高
        setSize(300, 100);
        //设置布局
        setLayout(new FlowLayout());
        //添加按钮
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        //设置窗口对象可见
        setVisible(true);
    }
}
