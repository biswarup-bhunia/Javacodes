package BasicJava.Evalutation4.question5;

public class FinallyExm {
    public static void main(String args[]){
        try {
            int div=45/0;
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("It always execute");
        }
    }
}
