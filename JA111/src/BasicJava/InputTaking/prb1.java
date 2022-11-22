package BasicJava.InputTaking;

import java.util.*;
class Main{

    static int count=0;

    static int check(int a, int b){
        return a+b;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int tc=sc.nextInt();
        while(tc-- >0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int bag = (Main.check(A,B));
            System.out.println(bag);
        }



    }

}
