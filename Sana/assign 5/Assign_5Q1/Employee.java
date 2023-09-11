package Assign_5Q1;

public class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;

    public void setemployeeId(int Id)
    {
        this.employeeId=Id;
    }

    public int getemployeeId()
    {
        return employeeId;
    }

    public void setemployeeName(String Name)
    {
        this.employeeName=Name;
    }

    public String getemployeeName()
    {
        return employeeName;
    }

    public void setsalary(double salary)
    {
        this.salary=salary;
    }

    public double getsalary()
    {
        return salary;
    }

    public double getnetSalary()
    {
        return netSalary;
    }


    public void calculateNetSalary(int pfpercentage)
    {

        double pfmoney=(pfpercentage/100.0) * salary;
        this.netSalary=salary-pfmoney;

    }


}
