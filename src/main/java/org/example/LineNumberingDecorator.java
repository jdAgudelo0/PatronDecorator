package org.example;

// Line numbering decorator
class LineNumberingDecorator extends TextDecorator {
    public LineNumberingDecorator(TextDocument textDocument) {
        super(textDocument);
    }

    @Override
    public void open() {
        super.open(); // Calls the open() method of the original object
        System.out.println("Adding line numbering.");
    }
}