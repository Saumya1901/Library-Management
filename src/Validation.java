import java.util.regex.*;
import java.util.*;

public class Validation {

    String email;
    String password;
    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

    Validation(String email,String password){
        this.email = email;
        this.password = password;
    }
    public boolean isValidEmailAddress() {
        return Pattern.compile(regex)
                .matcher(email)
                .matches();
    }
    public boolean isValidPassword(){
        int len = password.length();
        if(len < 5){
            return false;
        }
        return true;
    }
}
