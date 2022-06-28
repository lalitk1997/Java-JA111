public class Main1 {
    static int j = 200;
    static A a1 = new A();

    public static void main(String[] args) {
        Main1 obj = new Main1();
        System.out.println(obj.j);
        System.out.println(obj.a1);
        obj.a1.funA();

        System.out.println(Main1.a1);
        Main1.a1.funA(); // System.out.println(); (WORKS SAME WAY)

    }
}
