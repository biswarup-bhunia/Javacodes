package BasicJava.day3;

public class CricketScore {
    public static void main(String[] args) {
        int a = 1 , b = 2 , c = 3 , d = 4 , e = 6;
        totalScore(a,b,c,d,e);
    }

    static void totalScore(int x, int y , int z, int a , int b){
        System.out.println("Total score is "+(x+y+z+a+b));
    }
}
