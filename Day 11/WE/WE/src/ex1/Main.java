package ex1;

public class Main implements Inter{
    @Override
    public void func1() {
        System.out.println("Method Overriding Done !");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.func1();
        System.out.println(obj.constant);
    }
}
