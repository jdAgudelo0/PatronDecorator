package org.example;

// Abstract decorator class
public abstract class TextDecorator implements TextDocument {
    protected TextDocument textDocument; // Reference to the object being decorated

    public TextDecorator(TextDocument textDocument) {
        this.textDocument = textDocument;
    }

    @Override
    public void open() {
        textDocument.open(); // Calls the open() method of the original object
    }

    @Override
    public void save() {
        textDocument.save(); // Calls the save() method of the original object
    }
}
