package BasicJava.day6;
import java.util.Scanner;
public class Course {

    int courseId;
    String courseName;
    int courseFee;

    public static void main(String[] args) {
        String user = "Admin";
        String wrongUser = "Not Admin";
        String pass = "1234";
        String wrongPassword = "1456";
        authenticate(user,pass);
        authenticate(wrongUser,wrongPassword);

    }

    static void authenticate(String username , String password){
        if(username == "Admin" && password == "1234"){

            Scanner scanner = new Scanner(System.in);
            Course fwd = new Course();

            System.out.println("Enter The course ID: ");

            fwd.courseId = scanner.nextInt();

            System.out.println("Enter The Course Name: ");

            fwd.courseName = scanner.next();

            System.out.println("Enter The Course Fees: ");

            fwd.courseFee = scanner.nextInt();

            fwd.displayCourseDetails();
            scanner.close();
        }
        else
            System.out.println("Invalid Username or password");
    }

    void displayCourseDetails(){
        System.out.println(this.courseId);
        System.out.println(this.courseName);
        System.out.println(this.courseFee);
    }
}
