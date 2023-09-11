package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class System1 {

	
		public static void main(String[] args) {
			
			ArrayList<Student2> al=new ArrayList<>();  
			
			
			
			al.add(new Student2(101,"Vijay",23,90));  
			al.add(new Student2(106,"Ajay",27,80));  
			al.add(new Student2(105,"Jai",21,72)); 
			
			Student2 sh=new Student2();
			
			Collections.sort(al,sh);
			
			ArrayList<System3> ak=new ArrayList<>(); 
			
			ak.add(new System3(101,"Vijay",23,90));  
			ak.add(new System3(106,"Ajay",27,80));  
			ak.add(new System3(105,"Jai",21,72));
			
			System3 obj=new System3();
			
			
			Collections.sort(ak,obj);
			
			for(Student2 st:al)
				
		{  
				System.out.println(st.id+" "+st.name+" "+st.age+" "+st.totalmarks); 
				
				}
			
			for(System3 st:ak)
				
			{  
					System.out.println(st.id+" "+st.name+" "+st.age+" "+st.totalmarks); 
					
					}
		}
		
}			


