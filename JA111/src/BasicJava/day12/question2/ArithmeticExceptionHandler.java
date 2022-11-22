package BasicJava.day12.question2;

import java.util.Scanner;

public class ArithmeticExceptionHandler {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 2 numbers:");

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i = a / b;
            System.out.println("The quotient of "+a+"/"+b+"="+i);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage()+" caught");
        }
        finally {
            System.out.println("Inside finally block");
            sc.close();
        }


    }
}
