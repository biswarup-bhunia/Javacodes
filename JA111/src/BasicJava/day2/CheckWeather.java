package BasicJava.day2;

public class CheckWeather {
    //Assume these can have any value:
    static boolean isSnowing = false;
    static boolean isRaining = false;
    static double temperature = 60.0;

    public static void main(String[] args) {
        if(isRaining || temperature < 50 || isSnowing){
            System.out.println("Let's stay home");
        }
        else System.out.println("Let's go out!");


    }

}
