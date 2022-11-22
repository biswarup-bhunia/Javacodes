package BasicJava.day7;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StudentBean [] students = new StudentBean[num];
        for ( int i = 0 ; i < num ; i++){
            StudentBean s1 = new StudentBean();
            System.out.println("Enter Student Name");
            s1.setName(sc.next());
            System.out.println("Enter Student Address");
            s1.setAddress(sc.next());
            System.out.println("Enter Student Roll Number");
            s1.setRoll(sc.nextInt());
            System.out.println("Enter Student Marks");
            s1.setMarks(sc.nextInt());
            students[i] = s1;
        }
        int sum = 0;
        for (StudentBean x: students
             ) {
            System.out.println(x.getName());
            System.out.println(x.getAddress());
            System.out.println(x.getRoll());
            System.out.println(x.getMarks());
            sum+=x.getMarks();

        }
        System.out.println(sum/num);
    }
}
