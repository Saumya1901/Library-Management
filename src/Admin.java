
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Admin {
    String email , password;
    static Map<String,String> adminCredentials = new HashMap<>();
    Admin(String email,String password){
        this.email = email;
        this.password = password;
        adminCredentials.put(email,password);
    }

    public void printAllAdmins(){
        System.out.println("Printing Admins");
        for(Map.Entry<String,String> entry : adminCredentials.entrySet()){
            String userEmail = entry.getKey();
            String userPassword = entry.getValue();
            System.out.println("user email is "+ userEmail +" "+ "user password is "+userPassword);

        }
    }

}
