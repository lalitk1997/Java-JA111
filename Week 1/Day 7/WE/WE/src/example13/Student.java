package example13;

public class Student {
    int rollno;
    String name;
    String city;
    @Override
    public String toString(){
        return rollno+" "+name+" "+city;
    }

    Student(int rollno, String name, String city){
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Lalit", "Gurgaon");
        System.out.println(s1.toString());
    }
}
