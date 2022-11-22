package BasicJava.Evalutation4.day14.question4;
import java.util.*;
public class Employee implements Comparable<Employee>{
    private Integer empId;
    private String empName;
    private double empSalary;

    public Employee(Integer empId, String empName, double empSalary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empSalary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return Objects.equals(empId, other.empId) && Objects.equals(empName, other.empName)
                && Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary);
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        if(empSalary > o.empSalary) {
            return +1 ;
        }else if(empSalary < o.empSalary){
            return -1 ;
        }else {
            return 0 ;
        }
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
    }

}
