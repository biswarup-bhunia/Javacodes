package BasicJava.Evalution3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the number of student");
        int studentNum =data.nextInt();
        String [] studentName = new String[studentNum];
        for(int i = 0 ; i < studentNum ; i++){
            System.out.println("Enter the student name");
            String name = data.next();
            studentName[i] = name;
        }
        data.close();
    }
}
