package BasicJava.day11.Assignment.Question2;

import java.util.Scanner;

public class Demo {
    public Hotel provideFood(int amount){
            if(amount>2000){
                TajHotel tajHotel = new TajHotel();
                return tajHotel;
            }
            else if (amount>200 && amount<=1000) {

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
                h1.chickenBiryani();
                h1.masalaDosa();
            }
            else {
                h1.chickenBiryani();
                h1.masalaDosa();
            }
        }
        else{

            System.out.println("Please enter a amont geter then 200");

        }
    }
}

