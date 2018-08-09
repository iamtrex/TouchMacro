package com.iamtrex.ui;

import com.iamtrex.controller.ActionPerformer;
import com.iamtrex.controller.MacroManager;
import com.iamtrex.model.Macro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Panel that holds all the macros.
 */
public class MacroPanel extends JPanel implements ActionListener {

    private MacroManager macroManager;
    private ActionPerformer actionPerformer;

    private PlusButton bPlus;
    private List<MacroButton> macroButtons;

    private final int width = 4;

    public MacroPanel(){
        this.setLayout(new GridBagLayout());

        macroManager = new MacroManager();
        macroButtons = new ArrayList<>();
        actionPerformer = new ActionPerformer();

        List<Macro> allMacros = macroManager.getMacros();

        GridBagConstraints c = makeConstraints();
        int num = 0;
        for(Macro m : allMacros){
            MacroButton temp = new MacroButton(m);
            macroButtons.add(temp);
            temp.addActionListener(this);

            c.gridx = num % 4;
            c.gridy = num / 4;
            this.add(temp, c);
            num ++;
        }

        bPlus = new PlusButton();
        bPlus.addActionListener(this);

        c.gridwidth = width;
        c.gridy = c.gridy + 1;
        c.gridx = 0;
        this.add(bPlus, c);
    }

    private GridBagConstraints makeConstraints() {
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.insets = new Insets(1, 1, 1, 1);
        c.weightx = 1;
        c.weighty = 1;

        return c;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == bPlus){
            /* //TODO
             * add button...
             */
        }else if(macroButtons.contains(source)){
            actionPerformer.doAction(((MacroButton)source).getRegisteredMacro());
        }else{
            throw new IllegalStateException();
        }
    }
}
