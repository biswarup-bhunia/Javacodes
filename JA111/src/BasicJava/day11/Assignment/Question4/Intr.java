package BasicJava.day11.Assignment.Question4;

public interface Intr {
    int[] display(int p);
}

class Test implements Intr{
    public int[] display(int p){
        int x = 0;
        int[] primeNum = new int[p];
        for(int i = 0 ; i <= p ; i++){
           if(checkPrime(i) == true){
               primeNum[x++] = i;

           }
        }
        return primeNum;
    }

    boolean checkPrime(int num){
        int count = 0;
        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        else {
            return false;
        }
    }
}