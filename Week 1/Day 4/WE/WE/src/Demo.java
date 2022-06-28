public class Demo {
    void fun1(int i){
        System.out.println("inside fun1 of demo");
        System.out.println("the value of i is : "+i);
    }
    void fun2(A a1){
        System.out.println("inside fun1 demo");
        System.out.println("the value of a1 is :"+a1);
        a1.funA(); // NullPointerException if a1 --> null
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        byte x = 20;
        d1.fun1(x);

        double y = 100.00;
        d1.fun1((int)y);

        d1.fun2(new A());
    }
}
