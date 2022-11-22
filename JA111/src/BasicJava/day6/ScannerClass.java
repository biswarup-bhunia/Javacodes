package BasicJava.day6;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String:");

        String str = scanner.next();

        System.out.println("Enter the character position you want to access:");

        int pos = scanner.nextInt();

        System.out.println("Character at position 2 is :");

        System.out.println(str.charAt(pos));

        scanner.close();

    }
}
