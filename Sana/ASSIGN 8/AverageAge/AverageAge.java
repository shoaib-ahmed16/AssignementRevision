package com.java.averageAge;

public class AverageAge {

    public float calculateAverage(int[] age) {

        int sum = 0;
        float average=0;


        if (age.length >= 2) {
            for (int i = 0; i < age.length; i++) {
                if (age[i] >= 28 || age[i] <= 40) {
                    sum = sum + age[i];
                } else
                    System.out.println(" Invalid age encountered ");
            }
            average = (sum) / age.length;

        }


        else {
            System.out.println("Please enter a valid employee count");
        }
        return average;


    }

    public static void main(String[] args) {

        int[] age1 = {30, 35, 38};
        AverageAge aa=new AverageAge();
        float av= aa.calculateAverage(age1);

        System.out.println(av);
    }

}

