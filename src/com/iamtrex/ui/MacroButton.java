package com.iamtrex.ui;

import com.iamtrex.model.Macro;

public class MacroButton extends Button {
    private String name;

    public MacroButton(String name) {
        this.name = name;
        this.setText(name);
    }

    public String getName(){
        return name;
    }
}
