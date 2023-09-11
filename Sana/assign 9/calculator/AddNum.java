package com.java.calculator;

public class AddNum implements Calculator{
    int sum;

    public int calculate(int value1, int value2){
         sum= value1+value2;
        return sum;
    }
}
