package BasicJava.day10.question2;

public class Parent {
    final int i;

    public Parent(int i) {
        this.i = i;
    }


    void method1(){
        System.out.println(i);
    };
    final void method2(){
        System.out.println("Method2 of parent class");
    };
    void method3(){
        System.out.println("Method3 of parent class");
    };
}

final class Child extends Parent{

    Child(int i) {
        super(i);
    }

    @Override
     void method1(){
        System.out.println("Method1 of child class");
    }
    void method4(){
        System.out.println("Method4 of child class");
    }
}
