public class Student {
    int roll;
    String name;
    int marks;
    void displayStudentDetails() {
        System.out.println("Roll No : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Lalit";
        s1.marks = 80;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Rohit";
        s2.marks = 90;

        s1.displayStudentDetails();
        s2.displayStudentDetails();
    }
}
