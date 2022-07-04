package example4;

public class Dog extends Animal{
    Dog(){
        //super();
        System.out.println("Inside Dog class ......constructor");
    }
    String color = "black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
    void eat(){
        super.eat();
        System.out.println("Dog eating..... (inside dog class)");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.printColor();
        d1.eat();
    }
}
