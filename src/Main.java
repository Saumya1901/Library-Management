//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String email = "saumya.chauhan#reckitt.com";
        String password ="sfdasdf";

        User user = new User(email,password);


        System.out.println("printing all users");
        user.printAllUsers();
    }
}