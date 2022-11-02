/******************************************************************************
 * Copyright (c) Farhad Towfighian 2022.                                      *
 * https://github.com/far-tow                                                 *
 ******************************************************************************/

package se.lexicon;

public class App 
{
    public static void main( String[] args ) {

        Person erik = new Person(12333, "Erik", "Svensson");
        Person karin = new Person(111111, "Karin", "Person");

        Book java = new Book("Java for beginners", "Mehrdad Javan");
        Book ledarSkap = new Book("Ledarskap i offentlighet", "Jörgen Rundgren");

        System.out.println(ledarSkap.getBookInformation());
        System.out.println("---------------------------------------");

       // System.out.println(java.getBookInformation());
        java.setBorrower(erik);
        //ledarSkap.setBorrower(karin);
        System.out.println(java.getBookInformation() + "\n Borrower: " + java.getBorrowerInformation());
        System.out.println("----------------------------------------");


        //System.out.println(erik.getPersonInformation());
        //System.out.println(karin.getPersonInformation());
        //System.out.println(java.getBookInformation() + "\n Borrower: " + java.getBorrowerInformation());
    }
}
