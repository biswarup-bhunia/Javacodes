package BasicJava.day7;
import java.util.Scanner;
public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [][] matrix = new int[N][M];

        for(int i = 0 ; i < N ; i++){
            for (int j = 0 ; j < M ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j = 0 ; j < M ; j++){
            int sum = 0;
            for (int i = 0 ; i < N ; i++){
                if(matrix[j][i]%2==0){
                    sum += matrix[j][i];
                }
            }
            System.out.println(sum);
        }

    }
}
