package BasicJava.day9.Question3;
import java.util.Scanner;
public class Demo {
    public Hotel provideFood(int amount){
        if(amount >= 1000){
            TajHotel taj = new TajHotel();
            return taj;
        } else if (amount>200 && amount < 1000) {
            RoadSideHotel roadSideHotel = new RoadSideHotel();
            return roadSideHotel;
        }
        else return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You Amount");
        int amount = sc.nextInt();
        Demo d1 = new Demo();
        Hotel h1 = d1.provideFood(amount);
        if(h1 != null){
            if(h1 instanceof TajHotel){
                h1.welcome();
            }
            else {
                h1.welcome();
            }
        }
        else{

            System.out.println("Please enter a amont geter then 200");

        }
    }
}
