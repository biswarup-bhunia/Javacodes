package BasicJava.day8.YouPrb;

import java.util.Arrays;

public class Prb2 {
    public static void main(String[] args) {
        int arr[] = {10, 324, 45, 90, 9808};
        System.out.println(new Prb2().largeNum(arr));
    }

    int largeNum(int[] num){
        int max = Arrays.stream(num).max().getAsInt();
        return max;

    }
}
