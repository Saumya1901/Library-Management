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
