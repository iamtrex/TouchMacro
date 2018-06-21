package com.iamtrex.model;

import java.awt.event.KeyEvent;

public class Action {
    private int keyCode;
    private Motion m;
    private long delay;

    public Action(int keyCode, Motion m, long delay){
        this.keyCode = keyCode;
        this.m = m;
        this.delay = delay;
    }
    public int getKeyCode(){
        return keyCode;
    }
    public Motion getMotion(){
        return m;
    }
    public long getDelay(){
        return delay;
    }
}
