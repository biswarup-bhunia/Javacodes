package BasicJava.Evalutation4.question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SmallerThan {
    public static void main(String[] args) {
        int count = 0;
        List<Integer> nums = Arrays.asList(8,1,2,2,3);
        int key = 4;
        for (int el:nums){
            if(el<key){
                count++;
            }
        }
        System.out.println(count);
    }
}
