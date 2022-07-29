package LambdaExpression5;

public class Main {
    public static Intr fun1(){
        return n -> System.out.println("Welcome : "+n);
    }
    public static void main(String[] args){
        Intr i1 = fun1();
        i1.sayHello("Lalit");
    }
}
