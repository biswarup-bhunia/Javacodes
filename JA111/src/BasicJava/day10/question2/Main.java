package BasicJava.day10.question2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("ENter the number in between 1 to 10");
        int a = s1.nextInt();
        if(a>1 && a<10) {
            Parent popo = new Child(a);

            popo.method1();
            popo.method2();
            popo.method3();

            // here we want to downcasting ;

            Child c1 = (Child)popo ;
            c1.method4();
        }else {
            System.out.println("Invalid number");
        }
    }
}
