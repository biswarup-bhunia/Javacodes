package BasicJava.day12.question1;

import java.util.Scanner;

public class UserRegistration {
    String userName;
    String userCountry;
    public void registerUser (String username, String usercontry) throws InvalidCountryException{

            if (usercontry.equals("India")){
                System.out.println(username+" registration done successfully");
            }


            else throw new InvalidCountryException(username);



    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserRegistration obj = new UserRegistration();
        System.out.println("Enter Your Name:");
        obj.userName = sc.next();
        System.out.println("Enter Your Country");
        obj.userCountry = sc.next();
        try {
            obj.registerUser(obj.userName, obj.userCountry);
        }
        catch (InvalidCountryException e) {}

        sc.close();
    }
}
