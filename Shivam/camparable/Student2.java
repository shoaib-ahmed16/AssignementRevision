package camparable;

import java.lang.*;
import java.util.Collections;
import java.util.ArrayList;


public class Student2  implements Comparable <Student2> 
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
	
	public int compareTo(Student2 st){  
		if(this.id==st.id)  
		     return 0;  
		else if(this.id>st.id)  
		     return 1;  
		else  
		     return -1;  
		}  
	
	
	static class System1{
	public static void main(String[] args) {
		
		ArrayList<Student2> al=new ArrayList<>();  
		
		
		
		al.add(new Student2(101,"Vijay",23,90));  
		al.add(new Student2(106,"Ajay",27,80));  
		al.add(new Student2(105,"Jai",21,72));  
		
		Collections.sort(al);
		
		for(Student2 st:al)
			
	{  
			System.out.println(st.id+" "+st.name+" "+st.age+" "+st.totalmarks); 
			
			}
		

	}

}
}



