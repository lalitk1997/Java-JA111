package Ques2;
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Lalit";
        emp1.age= 24;
        emp1.salary = 1000.00;
        emp1.address = "Gurgaon";
        emp1.department = "IT";
        emp1.phoneNo = "8076122040";
        emp1.specialisation = "Backend";
        System.out.println(emp1.toString());
        Manager m1 = new Manager();
        m1.name = "Lalit Kumar";
        m1.age= 25;
        m1.salary = 10000.00;
        m1.address = "Noida";
        m1.department = "Sales";
        m1.phoneNo = "9876122040";
        m1.specialisation = "Customer Facing";
        System.out.println(m1.toString());
    }
}
