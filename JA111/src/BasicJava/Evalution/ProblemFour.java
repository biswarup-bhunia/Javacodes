package BasicJava.Evalution;

public class ProblemFour {
    public static void main(String[] args) {
        int i=1;
        do{
            if(i%2==0){
                System.out.print(i+",");
                i++;
            }
            else {
                i++;
                continue;

            }

        }while(i<=10);
    }
}
