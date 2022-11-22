package BasicJava.Evalutation4.question5;

public class ThrowsExm {

    public static void main(String[] args) {
        ThrowsExm obj = new ThrowsExm();
        try {
            System.out.println(obj.check(0, 0));
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Example of throws");
        }
    }
    int check(int x, int y) throws ArithmeticException {
        int div = x / y;
        return div;
    }
}
