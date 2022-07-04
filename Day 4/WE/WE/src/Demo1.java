public class Demo1 {
    int fun1(){
        System.out.println("inside fun1 of demo");
        long x = 20;
        return (int)x;
    }

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.fun1();

        long y = d1.fun1(); // IMPLICIT TYPECASTING
        System.out.println("Returned value is "+y);
    }
}
