package BasicJava.day12.question3;

public class AccountDemo {
    public static void main(String[] args) throws InsufficientFundsException {
        Account biswarup = new Account();

        biswarup.accountNumber = "45657968746";

        biswarup.deposit(5000);

        try {
            double withdrawAmount = biswarup.withdraw(400);
            if (withdrawAmount == 400) {
                System.out.println("Your withdraw of " + withdrawAmount + " is successful");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
