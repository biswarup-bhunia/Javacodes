package BasicJava.day10;

public class Student {
    private int roll;
    private int marks;
    private char grade;
    private String name;

    public Student() {

    }

    public Student(int roll, int marks, String name) {
        this.roll = roll;
        this.marks = marks;
        this.grade = calculateGrade(marks);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }

    public void displayDetails(){
        this.grade = calculateGrade(this.marks);
        System.out.println(toString());

    }
    private char calculateGrade(int marks){
        if(marks > 0){
            if(marks >= 500){
                return 'A';
            } else if (marks >= 400 && marks < 500) {
                return  'B';
            }
            else{
                return 'C';
            }
        }
        else return 'F';
    }
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
