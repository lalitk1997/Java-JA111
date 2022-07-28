package FuncInterface;

public class X implements Intr{

    @Override
    public void sayHello() {
        System.out.println("HELLO FROM THE sayHello() METHOD...");
    }

    public static void main(String[] args) {
        Intr obj = new X();
        obj.sayHello();
        obj.defaultHello();
        Intr.staticHello();
    }
}
