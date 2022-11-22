package BasicJava.Evalution2;

public class PrbFive {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
//        String bag = "";
        for(int i = 0 ; i < n ; i++){
            int x = arr[i]*2;
//            bag+=x+",";
            arr[i] = x;
        }
        System.out.println(arr);
    }
}
