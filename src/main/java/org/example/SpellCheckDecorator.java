package org.example;

// Spell check decorator
class SpellCheckDecorator extends TextDecorator {
    public SpellCheckDecorator(TextDocument textDocument) {
        super(textDocument);
    }

    @Override
    public void open() {
        super.open(); // Calls the open() method of the original object
        System.out.println("Performing spell check.");
    }
}