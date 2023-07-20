package com.kalaam.kalam.student;

public class Student {
    private int id;
    private String name;
    private String dept;
    private String rollno;

    public Student()
    {

    }

    public Student(int id, String name, String dept, String rollno) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.rollno = rollno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }
}
