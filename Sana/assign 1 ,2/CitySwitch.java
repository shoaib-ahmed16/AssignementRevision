package com.java.assignment;

public class CitySwitch {

    static void City(String c)
    {
        switch(c)
        {
            case "Mumbai":

                System.out.println("Financial City");
                break;

            case "Kolkata":

                System.out.println("City of joy");
                break;

            case "Delhi":

                System.out.println("Capital of the country");
                break;

            case "Bangalore":

                System.out.println("Cyber City");
                break;

            default:
                System.out.println("May be other Indian City");

        }
    }
}

class Calling{
    public static void main(String[] args) {

        CitySwitch ct=new CitySwitch();
        ct.City("punjab");
    }
}
