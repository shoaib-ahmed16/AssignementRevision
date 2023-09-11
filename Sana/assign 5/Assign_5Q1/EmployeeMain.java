package Assign_5Q1;

import java.util.Scanner;

public class EmployeeMain {

    public static Employee getEmployeeDetails(){

        Scanner sc = new Scanner(System.in);

        Employee em=new Employee();

        System.out.println(" Enter EmployeeId : ");
        int Id=sc.nextInt();
        System.out.println( );

        System.out.println("Enter EmployeeName : ");
        String Name=sc.next();

        System.out.println();

        System.out.println("Enter EmployeeSalary : ");
        Double salary=sc.nextDouble();

        em.setemployeeId(Id);
        em.setemployeeName(Name);
        em.setsalary(salary);

       return em;

    }

    public static int getPFPercentage()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter EmployeePfpercentage : ");

        int Percentage=s.nextInt();
        return Percentage;

    }

    public static void main(String[] args) {

        Employee Em=getEmployeeDetails();

        EmployeeMain employee=new EmployeeMain();

        Em.calculateNetSalary(employee.getPFPercentage());

        System.out.println(" EmployeeId : " +Em.getemployeeId() );
        System.out.println(" EmployeeName :" +Em.getemployeeName());
        System.out.println(" EmployeeSalary :" +Em.getsalary());
        System.out.println(" EmployeeNetSalary : "+ Em.getnetSalary());





    }
}

