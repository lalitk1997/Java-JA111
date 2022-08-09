package Que5;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double Salary;
    private double netSalary;

    Employee() {}

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        Salary = salary;
    }

    public void calculateNetSalary(double pfPercentage){
        // DEDUCT PF PERCENTAGE AND SET NET SALARY
        this.netSalary = this.Salary - ((pfPercentage/100) * this.Salary);
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
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
}
