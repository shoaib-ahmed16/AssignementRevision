package com.java.assignment;

public class StudentDetails {

    int roll;
    String name;
    int marks;

    void Student(){
        System.out.println("Roll is:" + roll);
        System.out.println("Name is :" + name);
        System.out.println("Marks is:" + marks);
    }
}

class Demo5{

    public static void main(String[] args) {

        StudentDetails sd=new StudentDetails();

        sd.roll=12;
        sd.name="sana";
        sd.marks =70;

        StudentDetails sdd= new StudentDetails();

        sdd.roll=1;
        sdd.name="sunny";
        sdd.marks=50;

        System.out.println("First Student");
        sd.Student();
        System.out.println("Second Student");
        sdd.Student();
    }
}
