package com.iamtrex.ui;

import com.iamtrex.controller.ActionController;
import com.iamtrex.model.Macro;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Window {
    public static void main(String[] args) {
        new Window();
    }
    private ActionController ac;
    private List<Button> macroButtons;

    public Window(){
        macroButtons = new ArrayList<>();

        window = new JFrame();
        window.setUndecorated(true);
        window.setFocusableWindowState(false);
        pane = new JPanel();
        pane.setLayout(new FlowLayout());


        ac = new ActionController();

        Map<String, Macro> buttonData = ac.getButtonData();
        for(String s : buttonData.keySet()){
            MacroButton mb = new MacroButton(s);

            macroButtons.add(mb);
            mb.addActionListener(ac::actionPerformed);
            pane.add(mb);
        }

        PlusButton plusButton = new PlusButton();
        plusButton.addActionListener(ac::actionPerformed);
        pane.add(plusButton);


        window.setContentPane(pane);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);


    }

    private JFrame window;
    private JPanel pane;

}
