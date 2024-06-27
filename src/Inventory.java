import java.util.HashMap;
import java.util.Map;

public  class Inventory {
    private static Map<String,Integer> availableCopies = new HashMap<>();


    Inventory(){

    }

    /**
     *
     * @param book that is being added to the inventory
     */
    public static void addBooks(Book book){
        String isbn = book.getIsbn();
        if(availableCopies.containsKey(isbn)){
            //book present
            availableCopies.put(isbn, availableCopies.get(isbn)+book.getCapacity());
        }
        else{
            //book not present
            availableCopies.put(isbn,book.getCapacity());
        }
    }
    public static void updateBooks(Book book){
        String isbn = book.getIsbn();
        if(availableCopies.containsKey(isbn)){
            //book present
            availableCopies.put(isbn, availableCopies.get(isbn)+book.getCapacity());
        }
        else{
            //book not present
            availableCopies.put(isbn,book.getCapacity());
        }


    }
    public static void deleteBooks(Book book){
            String isbn = book.getIsbn();
            availableCopies.remove(isbn);
    }
    /**
     *
     * @param book that is being issued
     *             when book is issued its capacity is decreased by 1
     */
    public static void updateCapacityIssued(Book book){

        String isbn = book.getIsbn();


        if(availableCopies.containsKey(isbn)){
            //book present
            availableCopies.put(isbn, availableCopies.get(isbn)-1);

            //deleting book from inventory it is not present
            if(availableCopies.get(isbn) == 0){
                deleteBooks(book);
            }
        }
        else{
            System.out.println("Book not present in inventory");
        }
    }

    /**
     *
     * @param book that is being returned
     *             update the capacity inventory +1 as the book is now returned
     */
    public static void updateCapacityReturned(Book book){
        String isbn = book.getIsbn();
        availableCopies.put(isbn, availableCopies.get(isbn) + 1);


    }

    /**
     *
     * @param book check books availability
     * @return whether book is present in inventory or not
     */
    public static  boolean bookAvailable(Book book){
        String isbn = book.getIsbn();
        if(availableCopies.containsKey(isbn)  && availableCopies.get(isbn) > 0)
                return true;
        return false;
    }

    /**
     * prints all Books with their capacity
     */
    public static void  printAllBooks(){
        for(Map.Entry<String,Integer> book: availableCopies.entrySet()){
            System.out.println(book.getKey()+" with no of copies " + book.getValue());
        }
    }

    public static int getCapacity(Book book){
        String isbn = book.getIsbn();
        return availableCopies.get(isbn);

    }





}
