package example12;

public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("eating (inside dog class)");
    }
    void bark(){
        System.out.println("Woof...(inside bark class)");
    }

}
