package Que1;

public class Demo {
    public static void main(String[] args) {
        // SAVING STRING TYPE
        System.out.println("String Type : ");
        GetSetElement<String> strObj = new GetSetElement<>();
        strObj.setElement("Lalit Kumar");
        System.out.println(strObj.getElement());

        // SAVING INT TYPE
        System.out.println("Integer Type : ");
        GetSetElement<Integer> intObj = new GetSetElement<>();
        intObj.setElement(100);
        System.out.println(intObj.getElement());

        // SAVING USER-DEFINED (STUDENT) TYPE
        System.out.println("Student Type : ");
        GetSetElement<Student> stuObj = new GetSetElement<>();
        stuObj.setElement(new Student(101, "Lalit Kumar", 200));
        System.out.println("Roll No : "+stuObj.getElement().rollNo+" Name : "+stuObj.getElement().name+
                " Marks : "+stuObj.getElement().marks);
    }
}
