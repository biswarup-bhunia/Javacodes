package SB101.Evalution2.Question3;
import java.util.concurrent.*;
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Products[] p1 =
                {
                new Products(5),
                new Products(10),
                new Products(12),
                new Products(4),
                new Products(8),
                new Products(6),
                } ;

        ExecutorService jobs = Executors.newFixedThreadPool(3) ;


        int i=1 ;

        for(Products p : p1) {

            Future<Integer> fi = jobs.submit(p) ;

            try {
                System.out.println("The product is p"+i+" : " + fi.get() );
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            i++ ;
        }

        jobs.shutdown();


    }
}

class Products implements Callable<Integer>{
    int tar ;
    int pro=1 ;

    public Products(int a) {
        // TODO Auto-generated constructor stub
        this.tar= a ;
    }


    @Override
    public Integer call() throws Exception {
        // TODO Auto-generated method stub

        for(int i=1 ; i<=tar ; i++) {
            pro*=i ;
        }

        return pro;
    }

}

