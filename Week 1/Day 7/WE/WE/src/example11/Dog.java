package example11;

public class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("eating bread....(inside dog class)");
    }
    void bark(){
        System.out.println("barking.......(inside dog class)");
    }
}
