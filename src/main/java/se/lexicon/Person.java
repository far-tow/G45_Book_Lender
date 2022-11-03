
package se.lexicon;

import java.util.Arrays;

public class Person {
    //Field
    private int personId;
    private String firstName;
    private String lastName;
    private Book[] borrowedBooks; //Creates an Array for Borrowed Books


    //Constructor
    public Person(int personId, String firstName, String lastName) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //Method
    // To show Person information
    public String getPersonInformation() {
        return "Person id: " + personId + " First Name: " + firstName + " Last Name: " + lastName;
    }

    // TODO: put in add array method

    public void loanBook(Book borrowedBook) {
        if (borrowedBooks == null) borrowedBooks = new Book[0]; //Control if borrowedBooks (array) is empty (null) then make a new array.

        if(borrowedBook.isAvailable()){ //checks if book is available
            borrowedBook.setBorrower(this); //adds book to "this" (ex. erik) person
            Book[] newArrayBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length + 1);
            newArrayBooks[newArrayBooks.length - 1] = borrowedBook; //moves all book(S) to borrowedBook

            borrowedBooks = newArrayBooks;
        } else {
            System.out.println("Book is not available!");
        }

    }

    public void showBorrowedBooks() {
       // todo: display all borrowed books for loop

       for (int i = 0 ; i < borrowedBooks.length; i++)

       System.out.println(borrowedBooks[i]);

        //System.out.println(Arrays.toString(borrowedBooks));

       System.out.println(borrowedBooks.length);

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
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
