package assignment5;

import java.util.Scanner;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
//for seeting the values taken from user	
	public void setEmployeeId(int id) 
	{
		this.employeeId=id;
		
	}
	
	public void setEmployeename(String Nme) 
	{
		this.employeeName=Nme;
		
	}
	public void setEmployeesalary(double salry) 
	{
		this.salary=salry;
		
	}
	
	//for getting the values 
	
	public int getemployeeId() {
		return employeeId;
	}
	public String getemployeeName() {
		return employeeName;
	}
	public double getemployeesalary() {
		return salary;
	}
	public double getnetSalary() {
		
		return netSalary;
		
	}
	 public void calculateNetSalary(int pfpercentage) 
	 {
		double pfamount=(pfpercentage / 100.0) * salary;
		this.netSalary=salary-pfamount;
	 }
public static  class Main{	 
	
		 public static Employee getEmployeeDetails() 
		 {		
			
			 Scanner sc= new Scanner(System.in);//used to take input from user
			 
			 Employee obj=new Employee();
			 
			 System.out.print("Enter Id: ");
			 int id= sc.nextInt();
			 sc.nextLine(); 
			 
			 System.out.print("Enter Name: ");
			 String Nme=sc.nextLine(); //?
			 
			 System.out.print("Enter salary: ");
			 double salry=sc.nextDouble(); 
			 
			 obj.setEmployeeId(id);
			 obj.setEmployeename(Nme);
			 obj.setEmployeesalary(salry);
			 
			 return obj;
			 	 
		 }
		
		 public static int getPFPercentage() 
		 {
			Scanner sc= new Scanner(System.in);
			 System.out.print("Enter a Pfpercentage : ");
			 
			 int percent=sc.nextInt();
			 
			 return percent;
		 }
			
		public static void main(String[] args) 
		{

			 Employee obj1 =getEmployeeDetails();
		 
			 Scanner sc2= new Scanner(System.in);
			 
			 int pfpercentage=getPFPercentage();
			 	 
			 obj1.calculateNetSalary(pfpercentage);
			 
			 System.out.println(" Id : "+ obj1.getemployeeId());
			 System.out.println(" Name : "+ obj1.getemployeeName());
			 System.out.println(" Salary : "+obj1.getemployeesalary());
			 System.out.println("netsalary : "+obj1.getnetSalary());  
		}
	 } 
}

