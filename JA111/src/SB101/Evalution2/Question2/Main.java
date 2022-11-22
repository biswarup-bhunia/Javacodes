package SB101.Evalution2.Question2;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ThreadA th = new ThreadA() ;

        Thread t1 = new Thread(th) ;

        t1.start();

        synchronized (t1) {

            try {
                t1.wait();

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        System.out.println("The Total Product  value is :-  " + th.pro);

    }
}
