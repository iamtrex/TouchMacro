package com.iamtrex.ui;

import com.iamtrex.model.Macro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * MacroButton that runs a macro when clicked.
 *
 */
public class MacroButton extends Button implements ActionListener {

    private Macro registeredMacro;

    public MacroButton(Macro registeredMacro){
        this.registeredMacro = registeredMacro;

        this.setText(registeredMacro.getMacroName());
        this.addActionListener(this);
    }

    public Macro getRegisteredMacro(){
        return registeredMacro;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
