
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import  java.util.*;
public class Main {

    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//        int role;
//        System.out.println("Enter 1 if user is a admin " +
//                "Enter 2 if user is a library member");
//        role = sc.nextInt();
//        InputDetail d = new InputDetail(role);
//
//        if(role == 1){
//            Admin admin = InputDetail.createAdmin();
//            admin.printAllAdmins();
//        }
//        else{
//            Borrower borrower = InputDetail.createUser();
//            borrower.printAllUsers();
//        }

    Library library = new Library();
        Book book1 = new Book("Hunger Games1", "kh", "1", "penguin", "fiction", 1999,5);
        Book book2 = new Book("Hunger Games2", "kh", "2", "penguin", "fiction", 1999,50);
        Book book3 = new Book("Hunger Games3", "kh", "3", "penguin", "fiction", 1999,25);
        Book book4 = new Book("Hunger Games4", "kh", "4", "penguin", "fiction", 1999,56);
        Book book5 = new Book("Hunger Games5", "kh", "5", "penguin", "fiction", 1999,67);


        Borrower borrower1 = new Borrower("saumye","1","saumya.chauhan");
        Borrower borrower2 = new Borrower("chauhan","2","saumya.chauhan1");
        Borrower borrower3 = new Borrower("raju","3","saumya.chauhan3");
        Borrower borrower4 = new Borrower("ramesh","4","saumya.chauhan4");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.issueBook(book1,borrower1);

        library.returnBook(book1,borrower1,new Date());
        Transaction.printLogs();
        //library.deleteBook(book5);
        //library.searchBook(book5);

        //library.printBooks();





    }
}