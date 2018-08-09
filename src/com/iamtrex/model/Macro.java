package com.iamtrex.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a keypress Macro.
 */
public class Macro {
    private List<KeyAction> keyActions;

    private String actionJSON;
    private String macroName;

    /**
     *
     * @param s - JSON form of Actions.
     */
    public Macro(String actionJSON, String macroName){
        this.actionJSON = actionJSON;
        this.macroName = macroName;

        keyActions = new ArrayList<>();

    }

    public String getActionJSON(){
        return actionJSON;
    }

    public String getMacroName(){
        return macroName;
    }
}
