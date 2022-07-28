package FuncInterface2;

public class X implements Intr{

    @Override
    public void sayHello() {
        System.out.println("Welcome...");
    }

    public static void main(String[] args) {
        Intr obj = new X();
        obj.sayHello();
        obj.fun1();
        System.out.println(obj.equals(obj));
        Intr.fun2();
    }
}
