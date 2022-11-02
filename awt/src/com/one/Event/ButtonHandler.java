package com.one.Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("要退出了" + e);
        System.exit(0);
    }
}
