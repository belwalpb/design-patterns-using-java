package com.company.memento;

/**
 * Editor, wo generates the states etc. called Originator also
 */
public class Editor {

    private String content;

    public EditorState createState() {
        return new EditorState(this.content);
    }

    public void restore(EditorState state) {
        this.content = state.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void printState() {
        System.out.println("Current Content: "+ this.content);
    }
}
