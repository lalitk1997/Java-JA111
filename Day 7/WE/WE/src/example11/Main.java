package example11;

public class Main {
    public static void main(String[] args) {
        Animal parent = new Dog();
        // Animal --> parent || Dog --> child
        parent.eat();
        // parent.bark()
        // Down-casting Parent Class obj to child class
        Dog d = (Dog)parent;
        d.bark();
        d.eat();
        Animal a = new Animal();
        a.eat();
    }
}
