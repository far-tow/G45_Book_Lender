package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Person erik = new Person(12333, "Erik", "Svensson");

        Book java = new Book("Java for beginners", "Mehrdad Javan");
        //java.setBorrower(erik);


        //System.out.println(erik.getPersonInformation());
        System.out.println(java.getBookInformation() + java.getBorrowerInformation());
    }
}
