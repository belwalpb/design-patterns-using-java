package com.company.memento;

/**
 * State of the editor, called Memento also
 */
public class EditorState {

    private final String content;

    protected EditorState(String content) {
        this.content = content;
    }

    protected String getContent() {
        return content;
    }


}
