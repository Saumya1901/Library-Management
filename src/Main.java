
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import  java.util.*;
public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int role;
        System.out.println("Enter 1 if user is a admin " +
                "Enter 2 if user is a library member");
        role = sc.nextInt();
        InputDetail d = new InputDetail(role);

        if(role == 1){
            Admin admin = InputDetail.createAdmin();
            admin.printAllAdmins();
        }
        else{
            User user  = InputDetail.createUser();
            user.printAllUsers();
        }






    }
}