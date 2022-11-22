package BasicJava.Evalution3;

public class AbstractMethod {
    // main method
    public static void main (String args[]) {
        Addition obj = new ExtendedPart();
        System.out.println (obj.addTwoNum (10, 50));
        obj.add();
    }

}

abstract class Addition {
    public abstract int addTwoNum (int n1, int n2);
    public void add() {
        System.out.println ("Add two int in abstraction class");
    }
}
class ExtendedPart extends Addition {
    public int addTwoNum(int num1, int num2) {
        return num1 + num2;
    }
}