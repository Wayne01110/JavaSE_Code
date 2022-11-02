package com.one.Event;

import java.awt.*;
import java.awt.event.*;

public class MultipleEventTest implements WindowListener, MouseListener, KeyListener {
    public static void main(String[] args) {

        MultipleEventTest met = new MultipleEventTest();
    }

    public MultipleEventTest() {
        Frame f = new Frame("MultipleEventTest");

        f.addWindowListener(this);
        f.addMouseListener(this);
        f.addKeyListener(this);
        f.setSize(400, 200);
        f.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window iconified" + e);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed" + e);
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window deiconified" + e);
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated" + e);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated" + e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("MousePressed" + e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("MouseReleased" + e);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("MouseClicked" + e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("MouseEntered" + e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("MouseExited" + e);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped" + e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed" + e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased" + e);
    }
}

