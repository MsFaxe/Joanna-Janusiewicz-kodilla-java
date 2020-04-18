package com.kodilla.stream.book;

public final class Book {
    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final String signature;

    public Book(String author, String title, int yearOfProduction, String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfProduction;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfPublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfProduction=" + yearOfPublication +
                ", signature" + signature + '\'' +
                '}';
    }
}
