/******************************************************************************
 * Copyright (c) Farhad Towfighian 2022.                                      *
 * https://github.com/far-tow                                                 *
 ******************************************************************************/

package se.lexicon;

import java.awt.print.Book;

public class Person {
    //Field
    private int personId;
    private String firstName;
    private String lastName;





    //Constructor
    public Person(int personId, String firstName, String lastName) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //Method
    // To show Person information
    public String getPersonInformation(){
        return "Person id: " + personId + " First Name: " + firstName + " Last Name: " + lastName;
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
