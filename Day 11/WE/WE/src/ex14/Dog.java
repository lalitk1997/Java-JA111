package ex14;
// Static Binding/ Early Binding : Type of Object is determined at compiler time.
public class Dog {
    private void eat(){
        System.out.println("Dog is eating...");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
    }
}
