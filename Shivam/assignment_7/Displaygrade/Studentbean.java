package Displaygrade;

public class Studentbean 
{
	private int Roll_no;
	private String Name;
	private int marks;
	private char grade;
	
	public void displayDetails() {

		Studentbean obj=new Studentbean();
		this.marks=450;
		this.Name="Shivam";
		this.Roll_no=45;
		System.out.println(Name);
		
		System.out.println(Roll_no);
		
		System.out.println(marks);
		
		System.out.println("Grade is : " +obj.calculateGrade(marks));
		
		
	}
	
	
	
	private char calculateGrade(int marks) 
	{
		
       if(marks>=500)   
       {
    	   return this.grade='A';
       }
       
       else if(marks<500 && 500>=400)
    	   
       {  
    	   return this.grade='B';
       }
       else   
       {
    	   return this.grade='c';
       }	
	}

	
}
