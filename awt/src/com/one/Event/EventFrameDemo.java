package com.one.Event;

import java.awt.*;

public class EventFrameDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Test Event");
        Button quit = new Button("Quit");

        f.add(quit);

        f.setLayout(new FlowLayout());
        f.setSize(500, 300);
        f.setVisible(true);

        quit.addActionListener(new ButtonHandler());
    }
}
