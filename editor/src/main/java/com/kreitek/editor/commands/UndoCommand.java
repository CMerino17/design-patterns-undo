package com.kreitek.editor.commands;

import java.util.ArrayList;

import com.kreitek.editor.Command;
import com.kreitek.editor.EditorCaretaker;

public class UndoCommand implements Command {

    private EditorCaretaker caretaker;

    public UndoCommand(EditorCaretaker caretaker){
        this.caretaker = caretaker;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        documentLines.clear();
        ArrayList<String> DocumentLinesRestore = new ArrayList<>();
        //caretaker.undo() devuelve la última posición de la lista de Mementos
        //para después coger el getState() de la clase Memento que nos devolverá ese estado
        DocumentLinesRestore = caretaker.undo().getState();
        if (DocumentLinesRestore != null) {
            documentLines.addAll(DocumentLinesRestore);
        }
    }

    
    
}
