package com.kreitek.editor;

import java.util.ArrayList;

public class Memento {
    private ArrayList<String> state;

    public Memento(ArrayList<String> documentLines){
        this.state = documentLines;
    }

    public ArrayList<String> getState(){
        return this.state;
    }
}
