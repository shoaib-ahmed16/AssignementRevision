package com.java.calculator;

public class DemoCalculator {

    public static void main(String[] args) {

        AddNum ad=new AddNum();
         int a=ad.calculate(10,4);
        System.out.println( "Addition of two number " +a);

        SubNum sb= new SubNum();
        int c= sb.calculate(10,4);
        System.out.println( "Substraction of two number" +c);

        MulNum ml=new MulNum();
         int d=ml.calculate(10,4);
        System.out.println( "Multiplication of two number"+d);

        DivNum dv=new DivNum();
        double e=dv.calculate(10,4);
        System.out.println("Division of two number " +e);
    }
}
