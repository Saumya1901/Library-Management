import java.util.HashMap;
import java.util.Map;

public class Transaction {
    private int borrowingDate, returnDate, dueDate;
    private  String transactionId;
    Map<String,String> transactionLog = new HashMap<String,String>();

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
        if(book.getAvailability()){
            //I can issue this book
            book.updateCapacityIssued();
            transactionLog.put(transactionId,"book issued");
        }
        else{
            transactionLog.put(transactionId,"book issue failed not enough capacity");
        }
    }

    /**
     *
     * @param book book that is being returned;
     */
    public void returnBook(Book book){
        book.updateCapacityReturned();
        transactionLog.put(transactionId,"book returned");
    }

    public void printLogs(){
        for(Map.Entry<String,String> transaction : transactionLog.entrySet()){
            System.out.println(transaction.getKey()+" " + transaction.getValue());
        }
    }


}
