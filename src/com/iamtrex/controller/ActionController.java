package com.iamtrex.controller;

import com.iamtrex.model.Action;
import com.iamtrex.model.Macro;
import com.iamtrex.ui.Button;
import com.iamtrex.ui.MacroButton;
import com.iamtrex.ui.PlusButton;
import com.iamtrex.util.ButtonFileManager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class ActionController implements ActionListener {
    private Robot robot;
    private Map<String, Macro> buttonData;
    private ButtonFileManager buttonFileManager;


    public ActionController(){
        //make Map
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        buttonFileManager = new ButtonFileManager();

        buttonData = buttonFileManager.readButtonData();

    }

    public Map<String, Macro> getButtonData(){
        return buttonData;
    }

    public void executeActions(String s){
        Macro macro = buttonData.get(s);
        List<Action> actions = macro.getActions();

        for(Action a : actions){
            switch(a.getMotion()){
                case DOWN:
                    robot.keyPress(a.getKeyCode());
                    System.out.println("Press " + a.getKeyCode());
                    break;
                case UP:
                    robot.keyRelease(a.getKeyCode());
                    System.out.println("Release " + a.getKeyCode());
                    break;
                default:
                    System.err.println("Unregistered Motion");
                    break;
            }

            try{
                Thread.sleep(a.getDelay());

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action Read");
        Object source = e.getSource();

        if(source instanceof Button){
            if(source instanceof MacroButton){
                MacroButton mb = (MacroButton)source;
                executeActions(mb.getName());
            }else if(source instanceof PlusButton){
                System.out.println("Would show new window to let you add another button");
            }
        }else{
            System.out.println("WHAT");
        }

    }
}
