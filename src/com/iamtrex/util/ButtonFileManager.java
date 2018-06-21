package com.iamtrex.util;

import com.iamtrex.model.Action;
import com.iamtrex.model.Macro;
import com.iamtrex.model.Motion;
import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class ButtonFileManager {
    public void writeButtonData(Map<String, Macro> data){

    }

    private Map<String, Macro> buttonData;


    public Map<String,Macro> readButtonData() {
        buttonData = new HashMap<>();

        //Test
        Action ctrlDown = new Action(KeyEvent.VK_CONTROL, Motion.DOWN, 25);
        Action ctrlUp = new Action(KeyEvent.VK_CONTROL, Motion.UP, 25);
        Action cDown = new Action(KeyEvent.VK_C, Motion.DOWN, 25);
        Action cUp = new Action(KeyEvent.VK_C, Motion.UP, 25);
        Action vDown = new Action(KeyEvent.VK_V, Motion.DOWN, 25);
        Action vUp = new Action(KeyEvent.VK_V, Motion.UP, 25);

        Macro copy = new Macro();
        copy.addAction(ctrlDown);
        copy.addAction(cDown);
        copy.addAction(cUp);
        copy.addAction(ctrlUp);

        Macro paste = new Macro();
        paste.addAction(ctrlDown);
        paste.addAction(vDown);
        paste.addAction(vUp);
        paste.addAction(ctrlUp);

        buttonData.put("Copy", copy);
        buttonData.put("Paste", paste);
        return buttonData;
    }
}
