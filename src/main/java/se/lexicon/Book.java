
package se.lexicon;

import java.util.UUID;

public class Book {

    //Field
    private final String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;


    //Constructor
    private Book() {
        this.id = UUID.randomUUID().toString();
        this.available = true;
    }

    public Book(String title, String author) {
        this();
        this.title = title;
        this.author = author;
    }


    public Book(String title, String author, Person borrower) {
        this(title, author);
        setBorrower(borrower);
    }
//Method

    //To show Book information
    public String getBookInformation() {
        if (borrower != null) {
            return "Title: " + title + " Author: " + author +" ## Borrowed by: " + getBorrowerInformation() + " ##";
        } else {
            return "Title: " + title + " Author: " + author + " Availability: " + getBorrowerInformation();
        }
        //return "Title: " + title + " Author: " + author + " Availability: " + available;
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
    public String getId() {
        return id;
    }
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
        this.setAvailable(false);
    }


}
