package com.java.animalThree;

public class Demo7 {

    public Animal[] getAnimals()
    {
//        Dog dg=new Dog();
//        Cat ct=new Cat();
//        Tiger tg=new Tiger();
        //Animal[] arr={dg,ct,tg};
        Animal[] arr={new Dog(),new Cat(),new Tiger()};

        return arr;

    }

    public static void main(String[] args) {

//        Dog dg=new Dog();
////        dg.handShake();
////        dg.makeNoise();
////        dg.eat();
//
//        Cat ct=new Cat();
////        ct.makeNoise();
////        ct.eat();
////        ct.walk();
//
//
//         Tiger tg=new Tiger();
////        tg.makeNoise();
////        tg.eat();
////        tg.walk();
        Demo7 demo=new Demo7();
        Animal[] ar=demo.getAnimals();

    for(Animal an:ar)
    {
        an.makeNoise();
        an.eat();
        an.walk();
        if(an instanceof Dog){
//            Animal a=new Animal();
            Dog d=(Dog) an;
            d.handShake();


        }

    }

    }
}
