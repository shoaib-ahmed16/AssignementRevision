package com.java.assignment;
import java.util.*;

public class PrimeFactor {

    static void prime(int n )
    {
        int j=0;
        int arr[] = {};
        if(n<100&&n>2){
         for(int i=1;i<n;i++)
         {
           if(n%i==0)
           arr[j]=i;
           j++;

         }
            System.out.println(arr[j]);
        }
        else
            System.out.println("invalid number");
    }
}

class Dem03{
    public static void main(String[] args) {
        System.out.println("sana");
        PrimeFactor pm=new PrimeFactor();
        pm.prime(40);
    }
}