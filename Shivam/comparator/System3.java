package comparator;

import java.lang.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class System3 implements Comparator <System3>  {

	int id;
	String name;
	int age;
	int totalmarks;

	public System3(int id,String name,int age,int totalmarks) 
	{
		this.age=age;
		this.name=name;
		this.id=id;
		this.totalmarks=totalmarks;
		
	}
	
//	public int compare(Student2 st){  
//		if(this.id==st.id)  
//		     return 0;  
//		else if(this.id>st.id)  
//		     return 1;  
//		else  
//		     return -1;  
//		}
	
	public System3() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public int compare(System3 o1, System3 o2) {
		
		if(o1.age==o2.age)  
		     return 0;  
		else if(o1.age > o2.age)  
		     return 1;  
		else  
		     return -1; 
		
		
	}

	
	
}
	


