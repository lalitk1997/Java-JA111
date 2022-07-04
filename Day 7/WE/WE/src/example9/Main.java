package example9;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();;
        Animal a2 = new Dog();
        a2.eat();
        Animal a3 = new BabyDog();
        a3.eat();;
        Animal a4 = new BabyDog();
        a4.eat();
        Dog a5 = new BabyDog();
        a5.eat();
    }
}
