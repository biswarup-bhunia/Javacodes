package SB101.Evalution2.Question4;

class ThreadA implements Runnable{
    Thread a ;
    public ThreadA(Thread a) {
        // TODO Auto-generated constructor stub
        this.a =a ;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            a.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int i=1 ; i<=10 ; i++) {

            System.out.println(Thread.currentThread().getName()+" is Gets : "+ i);

        }

    }

}

class ThreadB implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        int sum=0 ;

        for(int i=1 ; i<=20 ; i++) {
            sum+=i  ;


        }
        System.out.println(Thread.currentThread().getName()+"  Addition of First 20 Numbers : "+ sum);

    }

}

class ThreadC implements Runnable{
    Thread a ;
    public ThreadC(Thread a) {
        // TODO Auto-generated constructor stub
        this.a =a ;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            a.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int pro= 1 ;
        for(int i=1 ; i<=10 ; i++) {
            pro*=i ;


        }
        System.out.println(Thread.currentThread().getName()+" is Gets : "+ pro);



    }

}

public class Main {

    public static void main(String[] args) {

        ThreadB dh = new ThreadB() ;
        Thread t1 = new Thread(dh) ;
        t1.setName("Dhoni");
        t1.setPriority(10);

        ThreadC ro = new ThreadC(t1) ;
        Thread t2 = new Thread(ro) ;
        t2.setName("Rohit");
        t2.setPriority(8);

        ThreadA kh =new ThreadA(t2) ;
        Thread t3 = new Thread(kh) ;
        t3.setName("Kholi");
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();

    }

}
