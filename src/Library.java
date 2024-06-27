import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Library {
List<Book> books = new ArrayList<Book>();

    /**
     *
     * @param book to be added to the list
     *             if new book add it first time to the list
     *             if already present update its capacity
     */
    public void addBook(Book book){

        if(Inventory.bookAvailable(book) == false){
            books.add(book);
            Inventory.addBooks(book);
        }
        else{
            Inventory.updateBooks(book);
        }
    }

    /**
     * deleting the book from inventory
     * @param book
     */
    public void deleteBook(Book book){
        if(Inventory.bookAvailable(book)  == false){
            System.out.println("Book not present to be deleted");
        }
        else{
            Inventory.deleteBooks(book);
            books.remove(book);
        }
    }

    /**
     * searching the available book
     * @param book
     */

    public void searchBook(Book book){
        int present = books.indexOf(book);
        if (present == -1){
            System.out.println("Book not found");
        }
        else{
            System.out.println("Book found!");
        }
    }

    /**
     *  book being issued by the borrower
     * @param book
     * @param borrower
     */
    public void issueBook(Book book , Borrower borrower){
        Transaction transaction = new Transaction(Validation.generateId());
        transaction.issueBook(book, borrower);
        //if after issuing the book all books are finished delete it
        if(!Inventory.bookAvailable(book))
            deleteBook(book);

    }

    /**
     * book returned by borrower on the return date
     * @param book
     * @param borrower
     * @param returnDate
     */
    public void returnBook(Book book,Borrower borrower, Date returnDate){
        Transaction transaction = new Transaction(Validation.generateId());
        transaction.returnBook(book,borrower,returnDate);

    }

    /**
     * prints all books in inventory
     */

    public  void printBooks(){
       for(Book book : books){
           System.out.println(book.getTitle() +" "+ book.getAuthor() + " "+ book.getPublisher() +" " + book.getIsbn() +" " +book.getCapacity()) ;
       }
    }


}
