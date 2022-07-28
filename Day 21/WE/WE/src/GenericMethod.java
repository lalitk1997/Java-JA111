import GenericClass.GenericClass;

public class GenericMethod {
    // GENERIC METHOD WHICH CAN ACCEPT ANY TYPE OF ARGUMENT.
    public static <E> void printArray(E[] elements){
        for(E element : elements){
            System.out.println(element);
        }
        System.out.println();
    }

    public static <E> void displayData(E ele){
        System.out.println("Hello! Welcome to JAVA... Mr/Mrs "+ele);
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        GenericMethod.printArray(intArray);
        String[] strArray = {"Lalit", "Manish", "Rahul", "Sonu", "Meena"};
        GenericMethod.printArray(strArray);

        String name = "Lalit Kumar";
        GenericMethod.displayData(name);

        Integer num = 007;
        GenericMethod.displayData(num);
    }
}
