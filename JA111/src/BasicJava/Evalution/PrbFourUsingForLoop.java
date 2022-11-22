package BasicJava.Evalution;

public class PrbFourUsingForLoop {
    public static void main(String[] args) {
        String bag="";
        for (int i = 1 ; i <= 20 ; i++){
            if (i%2!=0) {
                continue;
            }
            else {
                bag += i + ",";
            }

        }
        System.out.println(bag);
    }
}
