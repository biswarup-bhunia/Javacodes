package SB101.Evalution2.Question5;

import java.io.Serializable;

public class Student implements Serializable {

    private Integer roll;
    private String name;
    private Integer marks;
    private String email;
    private String password;
    private Address address;

    public Student(Integer roll, String name, Integer marks, String email, String password, Address address) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public Student() {
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
