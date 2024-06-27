public class Book {
    private  String title , author , publisher,genre,isbn;
    private  int capacity , publicationYear ;


    Book(String title, String author,String isbn, String publisher,String genre,int publicationYear,int capacity ){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.capacity = capacity;

    }


    public String getTitle(){
        return title;
    }
    public void updateCapacity(int addedCapacity){
        capacity+=addedCapacity;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getCapacity() {
        return capacity;
    }
}
