package LambdaExpression3;

public class MyClass {
    public static void main(String[] args) {
        Intr i1 = (n1, n2) -> n1+n2;
        Intr i2 = (n1, n2) -> n1-n2;
        System.out.println(i1.calculate(1, 2));
        System.out.println(i2.calculate(2, 3));
    }
}
