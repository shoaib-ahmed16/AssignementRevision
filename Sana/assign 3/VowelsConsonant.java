package com.java.assignment;

public class VowelsConsonant {

    void character(String ch) {

        if (ch == "a" || ch=="A")
        {
            System.out.println("this is vowel");
        }
        else if (ch == "e"||ch == "E")
        {
            System.out.println("this is vowel");
        }
        else if (ch == "i"|| ch == "I")
        {
            System.out.println("this is vowel");
        }

        else if (ch == "o" || ch == "O")
        {
            System.out.println("this is vowel");
        }
        else if (ch == "U"|| ch == "u")
        {
            System.out.println("this is vowel");
        }
        else
        {
            System.out.println(" This is a consonant");
        }
    };
}


class Demo4{
    public static void main(String[] args) {

        VowelsConsonant vc=new VowelsConsonant();
        vc.character("U");
    }
}
