package Que2;

public class Main extends Poly{
    @Override
    public void fun1() {
        System.out.println("Main (Child) Class... fun1() method...");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun1();
    }
}
