package org.example;

// Basic implementation of a text document
public class BasicTextDocument implements TextDocument {
    @Override
    public void open() {
        System.out.println("Text document opened.");
    }

    @Override
    public void save() {
        System.out.println("Text document saved.");
    }
}