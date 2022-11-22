package BasicJava.day8.YouPrb;

public class Movie {
    private int dur ;
    private String name ;
    Movie(){

    }

    public Movie(int dur, String name) {
        this.dur = dur;
        this.name = name;
    }

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
