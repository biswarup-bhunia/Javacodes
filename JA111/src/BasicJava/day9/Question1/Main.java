package BasicJava.day9.Question1;

public class Main {

    public static Person generatePerson(Person person){
        if(person instanceof Student){
            Student s1 = (Student) person ;

            s1.courseFee = 300000;

            s1.courseEnrolled = "JA111" ;
            s1.studentId = 1 ;
            s1.name = "Ram" ;
            s1.gender = "Male" ;
            s1.a1.city = "Chennai" ;
            s1.a1.state = "TN" ;
            s1.a1.pinCode = "60001" ;

            return s1;
        }
        else {
            Instructor i1 = (Instructor)person ;
            i1.instructorId = 456 ;
            i1.salary = 45612 ;
            i1.a1.city = "Chennai" ;
            i1.a1.state = "TN" ;
            i1.a1.pinCode = "60001" ;
            i1.name = "Ratan" ;
            i1.gender = "Male" ;


            return i1 ;
        }
    }

    public static void main(String[] args) {
        Person newStudent = generatePerson(new Student());
        Person newInstructor = generatePerson(new Instructor());

        System.out.println(newStudent);
        System.out.println(newInstructor);


    }

}

class Person {
    String name;
    String gender;

    Address a1 = new Address();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name +
                ", gender='" + gender +
                ", a1=" + a1 +
                '}';
    }
}

class Address {
    String city ;
    String state;
    String pinCode ;

    @Override
    public String toString(){
        return "City"+city+"State"+state+"pinCode";
    }
}

class Instructor extends Person{
    int instructorId;
    int salary;

    @Override
    public String toString() {
        System.out.println(this.a1);
        return "Instructor{" +
                "instructorId=" + instructorId +
                ", salary=" + salary +
                '}';
    }
}

class Student extends Person{
    int studentId;
    String courseEnrolled ;
    int courseFee ;

    @Override
    public String toString() {
        System.out.println(this.a1);
        return "Student{" +
                "studentId=" + studentId +
                ", courseEnrolled='" + courseEnrolled +
                ", courseFee=" + courseFee +
                '}';
    }
}