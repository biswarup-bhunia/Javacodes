package BasicJava.Evalution2;

public class PrbOne {
    public static void main(String[] args) {
        String a = "Check";
        String b = "Check";
        // Check == operator
        if (a == b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Check  equals() method
        if (a.equals(b)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}