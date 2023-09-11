package com.java.assignment;

public class NaturalNumber {

    static void Natural(int n)
    {

       int sum=n*(n+1)/2;
        System.out.println(sum);
    }
}

  class Demo1{

    public static void main(String[] args) {

        NaturalNumber num=new NaturalNumber();
        num.Natural(5);

    }
}