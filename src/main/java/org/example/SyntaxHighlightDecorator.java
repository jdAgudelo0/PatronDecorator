package org.example;

// Syntax highlighting decorator
public class SyntaxHighlightDecorator extends TextDecorator {
    public SyntaxHighlightDecorator(TextDocument textDocument) {
        super(textDocument);
    }

    @Override
    public void open() {
        super.open(); // Calls the open() method of the original object
        System.out.println("Applying syntax highlighting.");
    }
}
