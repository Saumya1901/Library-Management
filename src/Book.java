public class Book {
    private  String title , author , publisher,genre,isbn;
    private  int capacity , publicationYear ;
    private  boolean availability ;

    Book(String title, String author,String isbn, String publisher,String genre,int publicationYear,int capacity ){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.capacity = capacity;
        availability = true;
    }

    public boolean getAvailability(){
        return availability;
    }

    public void updateCapacityIssued(){
        capacity-=1;
    }
    public void updateCapacityReturned(){
        capacity+=1;
    }

}
