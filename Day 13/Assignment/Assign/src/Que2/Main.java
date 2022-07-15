package Que2;

import java.util.Scanner;

public class Main {
    public static Employee getEmployeeDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee name : ");
        String empName = input.next();
        System.out.println("Enter employee id : ");
        int empId = input.nextInt();
        System.out.println("Enter employee salary : ");
        double salary = input.nextDouble();
        return new Employee(empId, empName, salary);
    }
    public static int getPFPercentage(){
        Scanner input = new Scanner(System.in);
         System.out.println("Enter PF percentage : ");
         int percentPF = input.nextInt();
         return percentPF;
    }
    public static void main(String[] args) {
        // Main obj = new Main();
        Employee emp = getEmployeeDetails();
        int amtPF = getPFPercentage();
        emp.calculateNetSalary(amtPF);
    }
}
