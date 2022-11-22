package BasicJava.day12.question3;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        System.out.println("Your balance is low");
    }
}
