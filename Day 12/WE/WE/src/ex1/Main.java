package ex1;

public class Main {
    static void display(String... values){
        System.out.println("display method invoked");
    }

    public static void main(String[] args) {
        display();
        display("Lalit");
        display("Raunak", "Ram Kisan");
    }
}
