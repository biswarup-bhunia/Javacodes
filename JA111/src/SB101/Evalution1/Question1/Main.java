package SB101.Evalution1.Question1;
import java.util.function.*;
public class Main {
    public static void main(String[] args) {
        Predicate<Student> p1 = (t -> t.getMarks() < 500);
        System.out.println("Use Predicate for output");
        System.out.println(p1.test(new Student(1206, "biswarup", 400)));
        System.out.println(p1.test(new Student(1206, "biswarup", 800)));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("use Supplier to create std obj and Consumer for output");
        Consumer<Student> c1 = (t -> System.out.println(t));
        Supplier<Student> s1 = () -> new Student(1206, "rup", 600);
        Student st = s1.get();
        c1.accept(st);
        System.out.println("---------------------------------------------------------------------------");
        Function<String, Integer> f1 = t -> Integer.parseInt(t);
        System.out.println("Function output");
        Integer i = f1.apply("50");
        System.out.println(i);
    }

}