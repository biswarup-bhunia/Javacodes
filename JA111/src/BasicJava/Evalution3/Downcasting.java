package BasicJava.Evalution3;

public class Downcasting {
    public static void main(String[] args) {
        Mother rina = new Daughter();
        rina.name = "Rina Roy";
        Daughter priya = (Daughter) rina;
        priya.name = "Priya Roy";
        System.out.println(rina.name);
        priya.showData();

    }
}

class Mother{
    String name;
    void showData(){
        System.out.println("All data of mother");
    }
}

class Daughter extends Mother{
    String name;
    void showData(){
        System.out.println("All data of Daughter");
    }
}