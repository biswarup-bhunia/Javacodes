package BasicJava.day3;

public class PrimeFactorial {
    public static void main(String[] args) {
        int x = 12;
        primeFac(x);

    }
    static void primeFac(int z){
        if (z<2 || z>100){
            System.out.println("Invalid number");
        }
        else {
            for (int i = 2 ; i <= z ; i++ ){
                while (z%i == 0){
                    System.out.print(i+" ");
                    z = z/i;
                }
            }
        }
    }
}
