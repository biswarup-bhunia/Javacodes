package BasicJava.Evalutation4.day14.question4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeSet<Employee> emp = new TreeSet<>();
        Scanner u1  =  new Scanner(System.in) ;
        while(true) {
            System.out.println("You want to add enter Y|N");
            String ch = u1.next() ;
            if (ch.equalsIgnoreCase("Y")) {
                System.out.println("ENter EMP- Name.. ");
                u1.nextLine();
                String name = u1.nextLine();

                System.out.println("ENterEMP-  Id.. ");
                int id = u1.nextInt();

                System.out.println("ENter EMP- -Salary.. ");
                double price = u1.nextDouble();

                emp.add(new Employee(id, name, price));
                System.out.println("EMployee added succesfully .. .!");
            } else{
                System.out.println(emp);
                break ;
            }
        }

    }
}
