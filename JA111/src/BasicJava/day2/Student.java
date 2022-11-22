package BasicJava.day2;

public class Student {
    int roll;
    String name;
    int marks;

    public static void main(String[] args) {
        Student biswarup = new Student();
        Student rup = new Student();
        biswarup.name = "Biswarup Bhunia";
        biswarup.roll = 1206;
        biswarup.marks = 6;
        rup.name = "Rup Bhunia";
        rup.roll = 12;
        rup.marks = 7;

        biswarup.displayStudentDetails();
        biswarup = null;
        rup.displayStudentDetails();
        rup = null;

    }
    void displayStudentDetails(){
        System.out.println("Roll is " + roll);
        System.out.println("Name is "+ name);
        System.out.println("Marks is "+ marks);
    }
}
