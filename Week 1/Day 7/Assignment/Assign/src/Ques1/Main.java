package Ques1;
// USE OF THIS
//  This is used to refer current class var, methods & constructors.
public class Main {
    int rollNo;
    String name;
    Main(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    void printDetails(){
        System.out.println("Name : "+name+", Roll No : "+rollNo);
    }
    public static void main(String[] args) {
        Main obj = new Main(1, "Lalit");
        obj.printDetails();
    }
}
