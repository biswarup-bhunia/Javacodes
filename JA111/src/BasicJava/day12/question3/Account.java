package BasicJava.day12.question3;

public class Account {
    String accountNumber;
    double balance;
    void deposit(double amount){
        balance+=amount;
    }
    double withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            return amount;
        }
        else return balance;
    }
}
