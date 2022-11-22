package BasicJava.day5;

public class Contructor {

    public static void main(String[] args) {
        ParamContractor ddjl = new ParamContractor();
        ddjl.duration = 2.30;
        ddjl.noOfSongs = 4;
        System.out.println(ddjl.duration);
        System.out.println(ddjl.noOfSongs);
        ParamContractor avaenger = new ParamContractor(0,2.48 );
        System.out.println(avaenger.duration);
        System.out.println(avaenger.noOfSongs);
    }

}

class ParamContractor {
    int noOfSongs;
    double duration;

    // default contractor

    ParamContractor(){
        System.out.println("I am here");
    }

    //Paramatarized contructor

    ParamContractor(int num1 , double dur){

        noOfSongs = num1;
        duration = dur;
        System.out.println("I am on param");
    }
}
