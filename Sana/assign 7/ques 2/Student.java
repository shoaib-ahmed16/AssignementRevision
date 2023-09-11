package Assign_7;

import java.util.Scanner;

public class Student {

    private int roll;
    private String name;
    private int marks;
    private char grade;

    public void displayDetails(){
        Student s=new Student();

        Scanner sc=new Scanner(System.in);

        this.roll= sc.nextInt();
        this.name=sc.next();
        this.marks=sc.nextInt();

        char x=s.calculateGrade();
        System.out.println(x);
    }

    private char calculateGrade(){

        if(marks>=500)
        {
           return 'A';
        }
        else if(marks<500 && marks>=400)
        {
            return 'B';
        }
        else
        {
            return 'C';
        }
    }





}
