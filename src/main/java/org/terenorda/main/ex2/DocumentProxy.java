package org.terenorda.main.ex2;

class DocumentProxy implements Document {
    private Document document;

    public DocumentProxy(Document document) {
        this.document = document;
    }

    @Override
    public String getTitle() {
        // Add custom transformation logic here if needed
        return document.getTitle();
    }

    @Override
    public String getContent() {
        // Add custom transformation logic here if needed
        return document.getContent();
    }

    @Override
    public String getAuthor() {
        // Add custom transformation logic here if needed
        return document.getAuthor();
    }
}

