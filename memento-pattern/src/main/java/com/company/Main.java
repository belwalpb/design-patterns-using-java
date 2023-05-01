package com.company;

import com.company.memento.Editor;
import com.company.memento.EditorState;
import com.company.memento.History;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.printState();

        editor.setContent("Content 1");
        history.pushState(editor.createState());

        editor.printState();

        editor.setContent("Content 2");
        history.pushState(editor.createState());

        editor.printState();

        editor.setContent("Content 3");

        editor.printState();

        editor.restore(history.popState());

        editor.printState();
    }
}
