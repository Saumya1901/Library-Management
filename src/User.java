import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class User {


 String email;
 String password;
 Map<String,String> userCredentials= new HashMap<>();
 User(String email,String password){
     this.email = email;

     this.password = password;
     addUser();
 }
public void addUser(){
     Scanner sc = new Scanner(System.in);

     Validation obj = new Validation(email,password);
     boolean emailValid = obj.isValidEmailAddress();
     boolean passwordValid = obj.isValidPassword();
     if(emailValid && passwordValid){
        userCredentials.put(email,password);
     }
      if(emailValid == false){
         System.out.println("Invalid Email");
         System.out.println("Enter new Email");

         setEmail(sc.nextLine());
     }
     if(passwordValid == false){
         System.out.println("Invalid password length should be more than 5");
         System.out.println("Enter new password");
         changePassword(sc.nextLine());

     }


}
public void setEmail(String email){
     this.email = email;
     addUser();
}
 public void changePassword(String password){
     this.password = password;
     addUser();
 }
public void printAllUsers(){
     for(Map.Entry<String,String> entry : userCredentials.entrySet()){
         String userEmail = entry.getKey();
         String userPassword = entry.getValue();
         System.out.println("user email is "+ userEmail +" "+ "user password is "+userPassword);

     }
}

}
