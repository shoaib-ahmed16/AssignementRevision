package assignment9;

public class DemoCalculator 
{

	
	public static void main(String[] args) 
	{
		
	    int value1=10;
		int value2=5;
		
		Calculator addition=new Addition();
		Calculator subtraction=new Subtraction();
		Calculator multiply=new Multiply();
		Calculator divide=new Divide();
		
		System.out.println(addition.calculate( value1 , value2));
		System.out.println(subtraction.calculate( value1 , value2));
		System.out.println(multiply.calculate( value1 , value2));
		System.out.println(divide.calculate( value1 , value2));
		
		
		
	}

}
