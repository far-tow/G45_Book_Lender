/******************************************************************************
 * Copyright (c) Farhad Towfighian 2022.                                      *
 * https://github.com/far-tow                                                 *
 ******************************************************************************/

package se.lexicon;

public class Book {

    //Field
    private String title;
    private String author;
    private boolean available;
    private Person borrower;


    //Constructor

    public Book() {
        this.available = false;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;


    }

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;

    }


    //Method

    //To show Book information
    public String getBookInformation() {
        return "Title: " + title + " Author: " + author + " Availability: " + available;
    }

    //To show Who has this book now (if there is any)
    public String getBorrowerInformation() {
        if (borrower != null) {
            return borrower.getPersonInformation();
        } else {
            return "Available";
        }
    }


    // Getter & Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }
}
