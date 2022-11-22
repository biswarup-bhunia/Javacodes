package BasicJava.day8.Assignment;

public class _3Main {
    public static void main(String[] args) {
        Employee biswa = new Employee();
        biswa.name = "Biswarup";
        biswa.age = 24;
        biswa.phNo = "884679874";
        biswa.address = "Rantua";
        biswa.salary = 40216.25;
        Manager rup = new Manager();
        rup.name = "Rup";
        rup.age = 27;
        rup.phNo = "8846544874";
        rup.address = "Gopi";
        rup.salary = 40216.25;
        rup.printSalary();
        biswa.printSalary();


    }
}

class Member{
    String name;
    int age;
    String phNo;
    String address;
    double salary;
    void printSalary(){
        System.out.println(this.salary);
    }
}
class Employee extends Member{
    String specialisation;
    String Department;
}
class Manager extends Member{
    String specialisation;
    String Department;
}