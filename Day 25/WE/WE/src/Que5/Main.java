package Que5;

import java.util.Scanner;

public class Main {
    public static Employee getEmployeeDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Id: ");
        int empId = in.nextInt();
        System.out.println("Enter Name : ");
        String name = in.next();
        System.out.println("Enter Salary : ");
        double salary = in.nextDouble();
        System.out.println("Enter PF percentage : ");
        int pfPercent = in.nextInt();
        Employee employee = new Employee(empId, name, salary);
        employee.calculateNetSalary(pfPercent);
        return employee;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Employee empData = Main.getEmployeeDetails();
        System.out.println("Id : "+empData.getEmployeeId());
        System.out.println("Name : "+empData.getEmployeeName());
        System.out.println("Salary : "+empData.getSalary());
        System.out.println("Net Dalary : "+empData.getNetSalary());
    }
}
