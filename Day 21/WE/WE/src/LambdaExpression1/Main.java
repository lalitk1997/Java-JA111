package LambdaExpression1;

public class Main {
    public static void main(String[] args) {
        /*
        Intr i = (String name) -> {
            System.out.println("Welcome : "+name);
        };
         */

        /*
        Intr i = (name) -> {
            System.out.println("Welcome : "+name);
        };
        */

        /*
        Intr i = (n) -> System.out.println("Welcome : "+n);
        */

        Intr i = n -> System.out.println("Welcome : "+n);
        i.sayHello("Lalit Kumar");
    }
}
