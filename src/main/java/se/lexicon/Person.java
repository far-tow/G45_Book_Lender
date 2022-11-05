
package se.lexicon;

import java.util.Arrays;

public class Person {
    //Field
    private int personId;
    private String firstName;
    private String lastName;
    private Book[] borrowedBooks; //Creates an Array for Borrowed Books


    //Constructor
    private Person() {
        this.personId = PersonSequencer.getNextId();
    }

    public Person(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //Method
    // To show Person information
    public String getPersonInformation() {
        return "Person{ personId=" + personId + ", firstName='" + firstName + ", lastName='" + lastName + ",number of borrowedBooks=" + borrowedBooks.length + '}';
    }

    /*public String getPersonInformation() {
        return "Person id: " + personId + " First Name: " + firstName + " Last Name: " + lastName;
    }*/


    public void loanBook(Book borrowedBook) {
        if (borrowedBooks == null) borrowedBooks = new Book[0]; //Control if borrowedBooks (array) is empty (null) then make a new array.

        if(borrowedBook.isAvailable()){ //checks if book is available
            borrowedBook.setBorrower(this); //adds book to "this" (ex. erik) person
            Book[] newArrayBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length + 1);
            newArrayBooks[newArrayBooks.length - 1] = borrowedBook; //moves all book(S) to borrowedBook

            borrowedBooks = newArrayBooks;
        } else {
            throw new IllegalArgumentException("Book was not available");
        }

    }
    public void returnBook(Book book) {
        if (book == null) throw new IllegalArgumentException("Book was null");

        Book[] newArray = new Book[borrowedBooks.length - 1];
        int counter = 0;
        for (Book elementArray : borrowedBooks) {
            if (elementArray.getId().equals(book.getId())) {
                book.setBorrower(null);
                continue;
            }
            newArray[counter++] = elementArray;
        }
        borrowedBooks = newArray;
    }

    public String showBorrowedBooks() {
        String stringBuilder = "";
        if (borrowedBooks != null) {
            for (Book book : borrowedBooks) {
                System.out.println(book.getBookInformation());
            }
            return stringBuilder.toString();
        }
        return null;
    }





    //Getter & Setter

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("firstName was null");
        this.firstName = firstName;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("lastName was null");
        this.lastName = lastName;
    }


}
