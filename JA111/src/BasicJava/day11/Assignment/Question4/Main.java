package BasicJava.day11.Assignment.Question4;

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        int [] arr = t.display(17);
        for (int x:arr
             ) {

            if(x!=0) {
                System.out.print(x+" ");
            }

        }
    }
}
