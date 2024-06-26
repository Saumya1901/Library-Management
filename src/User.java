import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class User {


 String email;
 String password;
 static Map<String,String> userCredentials= new HashMap<>();

 User(String email,String password){
     this.email = email;

     this.password = password;
     userCredentials.put(email,password);
 }

public void printAllUsers(){
     System.out.println("Printing Users");
     for(Map.Entry<String,String> entry : userCredentials.entrySet()){
         String userEmail = entry.getKey();
         String userPassword = entry.getValue();
         System.out.println("user email is "+ userEmail +" "+ "user password is "+userPassword);

     }
}

}
