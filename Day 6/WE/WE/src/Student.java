public class Student {
    public int roll_no;
    public String name;
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    public void printDetails(){
        System.out.println(roll_no+" "+name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Lalit");
        s1.printDetails();
        // CREATING ARRAY
        Student[] stuList = new Student[3];
        stuList[0] = new Student(2, "Vaibhav");
        stuList[0].printDetails();

    }
}
