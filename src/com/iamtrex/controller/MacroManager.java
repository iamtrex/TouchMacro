package com.iamtrex.controller;

import com.iamtrex.model.Macro;

import java.util.List;

/**
 * Holds all Macros.
 */
public class MacroManager {
    private MacroIO macroIO;

    private List<Macro> macros;

    public MacroManager(){
        macroIO = new MacroIO();
        macros = macroIO.loadMacros();
    }

    public List<Macro> getMacros(){
        return macros;
    }
}

