package example3;

public class Employee {
    String empId;
    String empName;
    double salary;
    static Address address;

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.empId = "ID1";
        emp1.empName = "Lalit";
        emp1.salary = 1000.000;
        Employee.address = new Address();
        Employee.address.city = "Gurgaon";
        Employee.address.pincode = "122001";
        Employee.address.state = "Haryana";
        System.out.println(emp1.empId+" "+emp1.empName+" "+emp1.salary+" "+Employee.address.pincode+" "+Employee.address.city+" "+Employee.address.state);
    }
}
