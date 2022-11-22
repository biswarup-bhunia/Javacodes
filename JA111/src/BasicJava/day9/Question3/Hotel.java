package BasicJava.day9.Question3;

public class Hotel {
    void welcome(){};

}

class TajHotel extends Hotel{
    @Override
        void welcome(){
        System.out.println("Welcome to Taj Hotel");
    }
}

class RoadSideHotel extends Hotel{
    @Override
    void welcome(){
        System.out.println("Welcome to RoadSideHotel");
    }
}
