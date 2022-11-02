package com.one.Layout.GridLayout;

import java.awt.*;

public class ShowGridDemo {
    public static void main(String[] args) {
        Frame f = new Frame("GridLayout example");

        f.setLayout(new GridLayout(0, 2));

        f.add(new Button("Button1"));
        f.add(new Button("Button2"));
        f.add(new Button("Button3"));
        f.add(new Button("Button4"));
        f.add(new Button("Button5"));
        f.add(new Button("Button6"));

        f.setSize(240, 240);

        f.setVisible(true);

    }
}
