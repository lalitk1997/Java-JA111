package ex2;

public class Main {
    static void display(String... values){
        System.out.println("display method invoked..");
        for(String s:values){
            System.out.println(s);;
        }
        System.out.println("=================");
        for(int i=0; i<values.length; i++){
            System.out.println(values[i]);
        }
    }

    public static void main(String[] args) {
        display();
        display("My", "name", "is", "Lalit", "Kumar");
    }
}
