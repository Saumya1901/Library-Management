import java.util.HashMap;
import java.util.Map;

public class Borrower {


private  String name, id , email ;
Borrower(String name , String id , String email){
    this.name = name;
    this.id = id;
    this.email = email;
}

    /**
     *
     * @param newEmail the new email (contact information ) user wants
     */

public void setEmail(String newEmail){
    email = newEmail;
}


}
