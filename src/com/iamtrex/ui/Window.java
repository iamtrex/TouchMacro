package com.iamtrex.ui;

import javax.swing.*;

public class Window extends JFrame {
    public static void main(String[] args) {
        new Window();
    }

    private MacroPanel macroPanel;

    public Window() {
        this.setUndecorated(true);

        macroPanel = new MacroPanel();

        this.setFocusable(false);
        this.setFocusableWindowState(false);
        this.setAlwaysOnTop(true);
        this.setContentPane(macroPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
