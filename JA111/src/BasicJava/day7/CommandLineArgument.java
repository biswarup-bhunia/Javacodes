package BasicJava.day7;

public class CommandLineArgument {
    static int number;
    public static void main(String[] args) {
        if(args.length > 2 || args.length <= 0){
            System.out.println("Error");
        } else if (args.length == 2) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            number = Math.abs(num1-num2);
        }
        else {
            int fact = 1;
            int num1 = Integer.parseInt(args[0]);
            for(int i = num1 ; i >= 1 ; i--){
                fact  *= i;
            }
            number = fact;
        }
        System.out.println(number);
    }


}
