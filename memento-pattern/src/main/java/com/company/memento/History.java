package com.company.memento;

import java.util.Stack;

/**
 * History of editor states. called Caretaker also
 */
public class History {

    private Stack<EditorState> stack = new Stack<>();

    public void pushState(EditorState state) {
        this.stack.push(state);
    }

    public EditorState popState() {
        if(this.stack.isEmpty()) {
            return null;
        }
        return this.stack.pop();
    }
}