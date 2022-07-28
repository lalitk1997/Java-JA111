package AnonymousClass;

public class Main {

    /*
    @Override
    public void sayHello(String name) {
        System.out.println("Hello : "+name);
    }
     */

    public static void main(String[] args) {
        Intr obj = new Intr() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello, Mr/Mrs "+name);
            }
        };
        obj.sayHello("Lalit");
    }
}
