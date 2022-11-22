package BasicJava.Evalutation4.question3;

public class Object {
    static void fun(){
        int[] array= new int[10];
        array[11]=100;
        Object object =null;
        object.toString();
    }

    public static void main(String[] args) {
        try {
            fun();
            System.out.println("Method working fine");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("The End");
        }

    }
}
