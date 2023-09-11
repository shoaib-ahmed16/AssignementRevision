package com.java.assignment;

public class CheckWeather {

    static boolean isSnowing = false;
    static boolean isRaining = true;
    static  double temperature = 20.0;

    public static void main(String[] args) {

        if(isSnowing==true){
            System.out.println("lets stay home");
        }
        else if(isRaining==false){
            System.out.println("Lets stay home");
        }
        else if(temperature>50)
        {
            System.out.println("lets stay home");
        }
        else
            {
                System.out.println("lets go out");
            }

    }
}
