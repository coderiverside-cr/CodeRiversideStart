package coderiverside.dsa.stack;

import java.util.Stack;

public class TextEditor {
    private final StringBuilder content;
    private final Stack<String> undoStack;
    private final Stack<String> redoStack;

    public TextEditor() {
        content = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void addText(String text) {
        content.append(text);
        undoStack.push(text);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            String lastAction = undoStack.pop();
            redoStack.push(lastAction);
            content.delete(content.length() - lastAction.length(), content.length());
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            String lastUndoneAction = redoStack.pop();
            undoStack.push(lastUndoneAction);
            content.append(lastUndoneAction);
        }
    }

    public String getContent() {
        return content.toString();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addText("Hello, world. ");
        editor.addText("Code Riverside is here. ");
        System.out.println("Current content: " + editor.getContent());

        editor.undo();
        System.out.println("Content after undo: " + editor.getContent());

        editor.redo();
        System.out.println("Content after redo: " + editor.getContent());
    }
}
