package Que2;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    Employee(){

    }
    Employee(int employeeId, String employeeName, double salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    public void calculateNetSalary(int pfPercentage){
         double salary = getSalary();
         double netSalary =  ((salary/100) * (100-pfPercentage));
         setNetSalary(netSalary);
        System.out.println("Employee ID : "+getEmployeeId());
        System.out.println("Employee Name : "+getEmployeeName());
        System.out.println("Employee Salary : "+getSalary());
        System.out.println("Employee Net-Salary : "+getNetSalary());
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
}
