package com.iamtrex.controller;

import com.iamtrex.model.Macro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MacroIO {

    public List<Macro> loadMacros() {
        List<Macro> macros = new ArrayList<>();

        //Read from file.
        try{
            // TODO.
            throw new IOException();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        return macros;
    }
}
