package Que1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println("");
        s1.setRoll(10265);
        s1.setName("Lalit");
        s1.setAge(25);
        s1.setMarks(300);
        System.out.println(s1.getRoll());
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
        System.out.println(s1.getAge());
    }
}
