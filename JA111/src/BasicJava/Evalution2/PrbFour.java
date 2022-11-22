package BasicJava.Evalution2;
import java.util.Scanner;
public class PrbFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scanner.next();
        System.out.println("Enter Your Age");
        int age = scanner.nextInt();
        System.out.println("My name "+name+" and age is "+age);
        scanner.close();
    }
}
