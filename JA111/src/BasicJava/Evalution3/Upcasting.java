package BasicJava.Evalution3;

public class Upcasting {

    public static void main(String[] args) {
        Father ram = (Father) new Son();

        ram.showData();
    }
}

class Father{
    void showData(){
        System.out.println("All data of father");
    }
}

class Son extends Father{
    void showData(){
        System.out.println("All data of son");
    }
}
