package SB101.Evalution2.Question5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Ram",500,"ram@gmail.com","Ram@123",new Address("West Bengal","Jhargram","721517")));
        list.add(new Student(2,"Sam",400,"sam@gmail.com","Sam@123",new Address("Jharkhand","Bihar","524181")));
        list.add(new Student(3,"Jam",300,"jam@gmail.com","Jam@123",new Address("Odisha","Baripada","654674")));
        list.add(new Student(4,"Kam",200,"kam@gmail.com","Kam@123",new Address("Maharashtra","Mumbai","657561")));
        list.add(new Student(5,"Lam",100,"lam@gmail.com","Lam@123",new Address("UP","Lucknow","546581")));

        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));

        obj.writeObject(list);
        obj.close();
        System.out.println("All data are serialize");
    }
}
