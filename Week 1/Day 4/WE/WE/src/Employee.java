public class Employee {
    String id;
    String name;
    int salary;
    Address address = new Address();
    void displayEmployee(){
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("Salary :"+salary);
        address.printAddress();
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Lalit Kumar";
        emp1.id = "FW18_0357";
        emp1.salary = 10000;

        emp1.address.city = "Gurgaon";
        emp1.address.pincode = "122001";
        emp1.address.state = "Haryana";

        emp1.displayEmployee();
    }
}
