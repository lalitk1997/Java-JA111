package LambdaExpression2;

public class Main {
    public static void main(String[] args) {
        Intr i1 = (n1, n2) -> System.out.println("Sum : "+(n1+n2));
        i1.sum(10, 20);
    }
}
