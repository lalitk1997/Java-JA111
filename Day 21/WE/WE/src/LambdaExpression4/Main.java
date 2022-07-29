package LambdaExpression4;

public class Main {
    // STATIC METHOD
    // REF OF INTERFACE IS PASSED AS ARGUMENT
    public static void fun1(Intr i1){
        System.out.println(i1.doMultiply(10, 20));
    }
    // STATIC FUNCTION
    public static void main(String[] args) {
        fun1((n1, n2) -> n1 * n2);
    }
}
