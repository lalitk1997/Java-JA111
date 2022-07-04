package Que1;

public class Student {
    int roll;
    String name;
    int age;
    int marks;
    Student(int roll, String name, int age, int marks){
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public Student(){

    }
    public void setRoll(int roll){
        this.roll = roll;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age > 18 && age < 60){
            this.age = age;
        }else{
            System.out.println("Enter valid age : ");
        }
    }
    public void setMarks(int marks){
        if(marks > 0 && marks < 500){
            this.marks = marks;
        }else{
            System.out.println("Enter valid marks : ");
        }
    }
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getMarks(){
        return marks;
    }
}
