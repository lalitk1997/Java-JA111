package example2;

public class Employee {
    String empId;
    String empName;
    Address address;

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.address = new Address();
        emp1.empId = "ID1";
        emp1.empName = "Lalit";
        emp1.address.city = "Gurgaon";
        emp1.address.pincode = "122001";
        emp1.address.state = "Haryana";

        System.out.println("Id : "+emp1.empId);
        System.out.println("Name : "+emp1.empName);
        System.out.println("City : "+emp1.address.city);
        System.out.println("Pincode : "+emp1.address.pincode);
        System.out.println("State : "+emp1.address.state);
    }
}
