package com.one.container;

import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里演示ScrollPane");

        //1：创建一个ScrollPane对象
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);

        //2：往ScrollPane对象添加内容
        sp.add(new TextField("这是测试文本"));
        sp.add(new Button("这是测试按钮"));
        //3：把ScrollPane添加到Freame中
        frame.add(sp);

        frame.setBounds(100,100,500,300);
        frame.setVisible(true);
    }
}
