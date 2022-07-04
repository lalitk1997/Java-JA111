package Ques2;

public class Employee extends Member{
    @Override
    public String toString(){
        return name+" "+age+" "+salary+" "+address+" "+department+" "+phoneNo+" "+specialisation;
    }
    String specialisation;
    String department;
}
