package org.example;
import java.util.HashMap;

public class Student {

    private String name;
    private int age;
    private double gpa;
    private final String studentId;
    private static int account = 10000;

    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;

        this.studentId = "ACC" + account;
        account++;
    }


    // Getters
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    double getGpa(){
        return this.gpa;
    }
    String getStudentId(){
        return this.studentId;
    }
    int getAccount(){
        return account;
    }

    // Setters
    void setName(String aname){
        if (aname == (null)){
            throw new IllegalArgumentException("Name cant be null");
        }
        this.name = aname;
    }

    void setAge(int age){
        if (age < 16){
            throw new IllegalArgumentException("Age is below 16");
        }
        this.age = age;
    }

    void setGpa(double gpa){
        if (gpa <= 0.0 || gpa > 4.0){
            throw new IllegalArgumentException("GPA can't be less than 0.0 or greater than 4.0");
        }
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return "Your name is " + this.name + " and you are: " + this.age + " Your gpa is" + this.gpa;
    }

    public static void main(String[] args){

        Student s1 = new Student("Njabs", 21, 1.5);
        System.out.println(s1.getAge());
        System.out.println(s1.getAccount());

        s1.setAge(20);
        System.out.println(s1.getAge());

        Student s2 = new Student("Busang", 28, 2.5);
        System.out.println(s2.getAccount());
    }
}
