package BasicJava.day13.question2;

import java.util.*;

public class MapStudent {
    public static void main(String[] args) {
        TreeMap<Student , String> stdMap = new TreeMap<>(new StudentMarksComp());

        stdMap.put(new Student(1,"Ram",450),"WestBengal");
        stdMap.put(new Student(2,"Sam",550),"Maharastra");
        stdMap.put(new Student(3,"Fam",650),"Bihar");
        stdMap.put(new Student(4,"Ham",750),"Tamilladu");
        stdMap.put(new Student(5,"Jam",250),"Jharkand");
        stdMap.put(new Student(6,"Kam",650),"Uttar Pradas");
        stdMap.put(new Student(7,"Uam",350),"Madha Pradas");
        stdMap.put(new Student(8,"Tam",850),"Odisha");

        Set<Map.Entry<Student,String>> key = stdMap.entrySet();

        for (Map.Entry<Student,String> k: key
             ) {
            System.out.println("****************************************************************************");
            System.out.println("State :"+k.getValue());


            Student student = k.getKey();
            System.out.println("Roll :" + student.getRoll());
            System.out.println("Name :" + student.getName());
            System.out.println("Marks :" + student.getMarks());

        }
    }
}
