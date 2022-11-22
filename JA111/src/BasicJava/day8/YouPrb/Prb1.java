package BasicJava.day8.YouPrb;

public class Prb1 {
    public static void main(String[] args) {
        int [] num = new int[10];
        int sum = 0;
        double avg;

        for(int i = 0 ; i < num.length ; i++){
            num[i] = i+1;
        }
        for(int x : num){
            sum+=x;
        }

        System.out.println(sum);
        avg =(double) sum/num.length;
        System.out.println(avg);
    }
}
