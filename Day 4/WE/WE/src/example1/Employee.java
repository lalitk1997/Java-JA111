package example1;

public class Employee {
    String id;
    String name;
    double salary;
    String address;

    Employee(String id, String name, double salary, String address){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Employee ID : "+id);
        System.out.println("Salary : "+salary);
        System.out.println("Address : "+address);
    }
}
