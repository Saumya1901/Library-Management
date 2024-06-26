import java.util.Scanner;

public class Library {

    String title , author , publisher,genre;
    Library(){

    }

    public void addBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Title");
        title = sc.nextLine();
        System.out.println("Enter Book Author");
        author = sc.nextLine();
        System.out.println("Enter Book Publisher");
        publisher = sc.nextLine();
        System.out.println("Enter Book genre");
        genre = sc.nextLine();
        Book book = new Book(title,author,publisher,genre);

        System.out.println("book added Successfully");
    }


}
