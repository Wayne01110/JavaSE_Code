package com.one.Layout.Test;

import java.awt.*;

public class TestPanel {
    public static void main(String[] args) {

        Frame f = new Frame("容器嵌套");

        Panel p1 = new Panel();
        p1.setBackground(Color.gray);

        Panel p2 = new Panel();
        p2.setBackground(Color.red);


        p1.add(new Label("我在第一个Panel里"));
        p2.add(new TextField("我在第二个Panel里"));

        p1.add(new Button("north"));
        p2.add(new Button("south"));
        f.add(p1, "North");
        f.add(new Button("West"),"West");
        f.add(p2, "South");
        f.add(new TextArea("我不在Panel里"));

        f.setVisible(true);
        f.setSize(360, 240);

    }
}
