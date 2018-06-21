package com.iamtrex.ui;

import com.iamtrex.model.Macro;

import javax.swing.JButton;
import java.awt.*;

public class Button extends JButton {

    public Button(){
        this.setSize(new Dimension(60,60));
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setFocusable(false);

    }
}
