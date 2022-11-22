package BasicJava.day3;

public class SwitchCase {
    public static void main(String[] args) {
        String x = "Mumbai";
        city(x);
    }

    static void city(String para){
        switch (para){
            case  ("Mumbai"):{
                System.out.println("Financial city");
                break;
            }
            case ("Kolkata"):{
                System.out.println("City of Joy");
                break;
            }
            case ("Delhi"):{
                System.out.println("Capital of the country");
                break;
            }
            case ("Bangalore"):{
                System.out.println("Cyber City");
                break;
            }
            default:
                System.out.println("May be Other Indian City");
                break;
        }
    }
}
