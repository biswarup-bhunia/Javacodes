package BasicJava.day12.question1;

public class InvalidCountryException extends Exception{
   public InvalidCountryException(String user){

        System.out.println(user+" outside India cannot be registered");

    }
}
