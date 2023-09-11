package assignmentQ10;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	 void displayStudentsDetails() 
	 {
		 System.out.println("Roll is :" + roll);
		 System.out.println("Name is :" + name);
		 System.out.println("Marks is :" + marks);
		
	};
	

	public static void main(String[] args) {
		
		
		Student obj1=new Student();
		obj1.name="Shivam";
		obj1.roll=20;
		obj1.marks=80;
		Student obj2=new Student();
		obj2.name="chauhan";
		obj2.roll=22;
		obj2.marks=90;
		
		obj1.displayStudentsDetails();
		obj2.displayStudentsDetails();
		

	}

}
