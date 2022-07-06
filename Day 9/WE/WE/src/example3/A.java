package example3;

public class A {
    private A(){
        System.out.println("private A() constructor ...");
    }

    public static void main(String[] args) {
        A obj = new A();
    }
}
