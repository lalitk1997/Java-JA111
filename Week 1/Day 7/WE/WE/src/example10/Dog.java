package example10;

public class Dog extends Animal{
    public static void main(String[] args) {
        Dog d = new Dog();
        // Animal is a parent class
        System.out.println(d instanceof Animal);
    }
}
