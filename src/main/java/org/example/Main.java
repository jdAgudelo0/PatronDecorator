package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a basic text document
        TextDocument basicDocument = new BasicTextDocument();

        // Add additional functionalities using decorators
        TextDocument decoratedDocument = new SyntaxHighlightDecorator(new SpellCheckDecorator(new LineNumberingDecorator(basicDocument)));

        // Open and save the decorated document
        decoratedDocument.open();
        decoratedDocument.save();
    }
}