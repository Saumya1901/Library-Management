
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import  java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String email = "";
        String password ="";
        while(1){
            System.out.println("Enter email");
            email = sc.nextLine();
            System.out.println("Enter password");
            password = sc.nextLine();
            Validation obj = new Validation(email,password);
            boolean emailValid = obj.isValidEmailAddress();
            boolean passwordValid = obj.isValidPassword();
            if(emailValid && passwordValid){
                System.out.println("User registered");
                User user = new User(email,password);

                break;
            }
            else{
                System.out.println("Details are invalid");
            }

        }

        User user = new User(email,password);


        System.out.println("printing all users");
        user.printAllUsers();
    }
}