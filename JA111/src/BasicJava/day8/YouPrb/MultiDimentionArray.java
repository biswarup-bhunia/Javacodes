package BasicJava.day8.YouPrb;

public class MultiDimentionArray {
    public static void main(String[] args) {
        int row = 2;
        int column = 3;
        int value = 0;
        int[][] matrix = new int[row][column];

        for(int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < column ; j++){
                matrix[i][j] = value++;
            }
        }

//        for(int i = 0 ; i < row ; i++){
//            for (int j = 0 ; j < column ; j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//        }
        for(int[] arr: matrix)
        {
            System.out.println(arr);
        }
    }
}
