package com.iamtrex.model;

import java.util.ArrayList;
import java.util.List;

public class Macro {
    private List<Action> actions;
    public Macro(List<Action> actions){
        this.actions = actions;
    }
    public Macro(){
        actions = new ArrayList<>();
    }

    public void addAction(Action a){
        actions.add(a);
    }
    public List<Action> getActions(){
        return actions;
    }

}
