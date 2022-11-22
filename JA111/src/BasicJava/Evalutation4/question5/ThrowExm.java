package BasicJava.Evalutation4.question5;

public class ThrowExm {
    public static void check(int num) {
        if (num < 1) {
            throw new ArithmeticException("Number is less then 1");
        }
        else {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        ThrowExm obj = new ThrowExm();
        obj.check(0);
    }
}
