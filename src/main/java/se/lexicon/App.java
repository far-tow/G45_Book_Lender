package se.lexicon;

public class App 
{
    public static void main( String[] args ) {
        Book java = new Book("Java for beginners", "Mehrdad Javan");
        Book ledarSkap = new Book("Ledarskap i offentlighet", "Jörgen Rundgren");

        Person erik = new Person(12333, "Erik", "Svensson");
        erik.loanBook(java);
        erik.loanBook(ledarSkap);
        erik.showBorrowedBooks();


        System.out.println(java.getBorrowerInformation());

        Person karin = new Person(111111, "Karin", "Person");
       // karin.loanBook(java);




        //System.out.println(erik.getPersonInformation());
        //System.out.println(karin.getPersonInformation());
       // System.out.println(java.getBookInformation() + "\n Borrower: " + java.getBorrowerInformation());
    }
}
