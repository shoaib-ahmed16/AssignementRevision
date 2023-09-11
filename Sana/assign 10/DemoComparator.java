package com.java.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class DemoComparator {

    public static void main(String[] args) {

        ArrayList<Student> sc=new ArrayList<>();

        Student std1=new Student();
        std1.id=10;
        std1.name="sana";
        std1.age=12;
        std1.totalMarks=100;

        Student std2=new Student();
        std2.id=2;
        std2.name="shana";
        std2.age=20;
        std2.totalMarks=50;

        Student std3=new Student();
        std3.id=4;
        std3.name="sunny";
        std3.age=14;
        std3.totalMarks=70;

        Student std4=new Student();
        std4.id=1;
        std4.name="kishu";
        std4.age=21;
        std4.totalMarks=80;

        sc.add(std1);
        sc.add(std2);
        sc.add(std3);
        sc.add(std4);

      StudentSortingById  ssb=new StudentSortingById();
      Collections.sort( sc,ssb);


        for (Student s:sc){
            System.out.println(s.id + " "+ s.name +" "+ s.age + " "+ s.totalMarks);
        }
    }
}
