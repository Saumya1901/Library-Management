import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Transaction {
    private Date borrowingDate, returnDate, dueDate;
    private  String transactionId;
    public static Map<String,String> transactionLog = new HashMap<String,String>();

    /**
     *
     * @param transactionId uniquely identifies the transaction
     */
  Transaction(String transactionId){
    this.transactionId = transactionId;
  }

    /**
     *
     * @param book the book need to be borrowed
     * @param borrower the borrower of the book
     *                 fuction can issue the book -- check if availble or not
     */
    public  void issueBook(Book book , Borrower borrower){

        if(Inventory.bookAvailable(book)){
            int capacityBefore = Inventory.getCapacity(book);

            Inventory.updateCapacityIssued(book);
            int capacityAfter = Inventory.getCapacity(book);

            borrowingDate = new Date();
            dueDate = new Date(borrowingDate.getTime() + (1000L * 60L * 60L * 24L * 30L));

            transactionLog.put(transactionId," "+
                    book.getTitle()  + " issued by " + borrower.getName() + "with due date" + dueDate +"  before capacity " +capacityBefore +" after capacity "+ capacityAfter);


            System.out.println("Transcation completed book issued by "+ borrower.getName());
        }
        else{
            transactionLog.put(transactionId, book.getTitle() +" issued failed " + borrower.getName() + "not enough present");
            System.out.println("Transaction failed");
        }
    }

    /**
     *
     * @param book book that is being returned;
     */
    public void returnBook(Book book,Borrower borrower, Date returnDate){
        Inventory.updateCapacityReturned(book);
        this.returnDate = returnDate;
        System.out.println("returned book " + book.getTitle() + "by " + borrower.getName() );
        transactionLog.put(transactionId,
                book.getTitle() + "returned by " +  borrower.getName() + "with id" + borrower.getId() +"on"+ returnDate);
    }

    public static void printLogs(){
        System.out.println("Printing transaction logs");
        for(Map.Entry<String,String> transaction : transactionLog.entrySet()){
            System.out.println(transaction.getKey()+" " + transaction.getValue());
        }
    }


}
