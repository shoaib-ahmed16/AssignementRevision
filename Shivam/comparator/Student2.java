package comparator;


import java.lang.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;


public class Student2  implements Comparator <Student2> 
{
	int id;
	String name;
	int age;
	int totalmarks;

	public Student2(int id,String name,int age,int totalmarks) 
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
	
	public Student2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		if(o1.totalmarks==o2.totalmarks)  
		     return 0;  
		else if(o1.totalmarks>o2.totalmarks)  
		     return 1;  
		else  
		     return -1;  
		
	}
}
	
	
	

	




	

