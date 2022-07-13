package ex7;

public class Main {
    public static void main(String[] args) {
        InterImpl1 i1 = new InterImpl1();
        i1.method1();
        i1.method2();
        Intr obj1 = new InterImpl1();
        obj1.method1();
        obj1.method2();
        InterImpl1 obj2 = (InterImpl1) obj1;
        obj2.method1();
        obj2.method2();
    }
}
