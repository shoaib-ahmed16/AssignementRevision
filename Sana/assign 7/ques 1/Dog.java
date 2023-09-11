package com.java.animalThree;

public class Dog extends Animal{

    @Override
    public void makeNoise()
    {
        System.out.println("Barking.......");
    }

    public void handShake(){
        System.out.println("Dog is handshaking");
    }
}
