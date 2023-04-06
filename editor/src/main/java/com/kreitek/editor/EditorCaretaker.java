package com.kreitek.editor;

import java.util.ArrayList;
import java.util.List;

public class EditorCaretaker {
    List<Memento> mementos = new ArrayList<>();

    public void push(Memento memento){
        mementos.add(memento);
    }

    public Memento undo(){
        if (mementos.size() > 0) {
            mementos.remove(mementos.size() - 1);
            if (mementos.size() != 0) {
                return mementos.get(mementos.size() - 1);
            }
            return null;
        }
        return null;
    }
}
