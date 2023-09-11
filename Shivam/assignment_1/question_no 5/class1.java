package assignment1q5;
import java.util.ArrayList;

public class Class1 
{
	
  public ArrayList<Integer>  printPrimeFactor(int N)
	{
			
			ArrayList<Integer> obj1=new ArrayList<>();
		     
		    
		    if(N>2&&N<100)
		    {
		    	for(Integer i=1;i<=N;i++) 
		    	{
		    		if(N%i==0)
		    		{
		    			 obj1.add(i);	
		    		}
		    	}
		    }
		    else 
		    {
		    	System.out.println("Supply valid Argument");
		    }
		 return obj1;
	}	
}





