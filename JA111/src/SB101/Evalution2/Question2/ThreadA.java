package SB101.Evalution2.Question2;

public class ThreadA implements Runnable{
    int pro=1 ;

    @Override
    public void run() {
        synchronized (this) {
            for(int i=1 ; i<=10 ; i++ ) {
                pro*=i ;
            }
            this.notify();
        }

    }
}
