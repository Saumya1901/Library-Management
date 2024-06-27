//import java.util.Scanner;
//
//public class InputDetail {
//
//    int role;
//    static String email = "";
//    static String password ="";
//    InputDetail(int role){
//        this.role = role;
//        inputDetails();
//    }
//    public void inputDetails(){
//        Scanner sc = new Scanner(System.in);
//
//        while(true){
//            System.out.println("Enter email");
//            email = sc.nextLine();
//            System.out.println("Enter password");
//            password = sc.nextLine();
//
//
//            Validation obj = new Validation(email,password);
//            boolean emailValid = obj.isValidEmailAddress();
//            boolean passwordValid = obj.isValidPassword();
//
//            if(emailValid && passwordValid){
//
//                break;
//            }
//            else{
//                System.out.println("Details are invalid");
//            }
//
//        }
//    }
//
//
//    public static Borrower createUser(){
//        System.out.println("Registering User");
//        return new Borrower(email, password);
//    }
//    public static Admin createAdmin(){
//        System.out.println("Registering Admin");
//        return new Admin(email, password);
//    }
//
//
//
//}
