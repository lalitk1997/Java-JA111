public class Demo3 {
    public A fun1(){
        System.out.println("inside fun1 od Demo3");
        return new A();
    }
    public int a = 10;

    public static void main(String[] args) {
        Demo3 d1 = new Demo3();
        A a1 = d1.fun1();
        a1.funA();
        Object OBJ = d1.fun1();
    }
}
