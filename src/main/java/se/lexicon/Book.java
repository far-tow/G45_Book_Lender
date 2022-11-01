package se.lexicon;

public class Book {

    //Field
    private String title;
    private String author;
    private boolean available;

    // To create a Borrower for the books. DON'T FORGET TO CREATE GETTER & SETTER FOR THIS!!
    private Person borrower;


    //Constructor

    public Book(){
        this.available = false;
    }
    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
        setAvailable(available);

    }

    public Book(String title, String author, boolean available) {
        setTitle(title);
        setAuthor(author);
        setAvailable(available);

    }


    //Method

    //To show Book information
    public String getBookInformation(){
        return "Title: " + title + " Author: " + author + " Availability: " + available;
    }

    //To show Who has this book now (if there is any)
    public String getBorrowerInformation (){
        if (borrower != null){
            return borrower.getPersonInformation(); //TODO: Make a method for personInformation in Person.class
            }
        else {
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
