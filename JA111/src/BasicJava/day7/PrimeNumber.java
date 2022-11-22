package BasicJava.day7;

public class PrimeNumber {
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        int z = 0;
        int[] primeNumber = new int[z+1];
        for (int x:inputArray
             ) {

            if(x > 1){
                int count = 0;
                for(int i = 1 ; i <= x ; i++){
                    if(x%i == 0)
                        count++;
                }
                if(count == 2){
                    primeNumber[z] = x;
                    z++;
                }
            }

        }
        return primeNumber;

    }
    public static void main(String[] args){
        int[] arr = {10,12,5,50,11,14,15};
//Create the object of Main class
        PrimeNumber obj = new PrimeNumber();
//on the object of Main class call the findAndReturnPrimeNumbers method
        int [] primeArr = obj.findAndReturnPrimeNumbers(arr);
//by supplying the following array as the parameter
        if(primeArr.length == 0){
            System.out.println("Prime number not found in the supplied Array");
        }
        else {
            for (int x:primeArr
            ) {
                System.out.print(x+",");
            }
        }



    }



}
