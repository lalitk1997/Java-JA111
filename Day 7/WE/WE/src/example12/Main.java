package example12;

public class Main {
    void funcCall(Animal a){
        a.eat();
        if(a instanceof Dog){
            System.out.println("a instanceof Dog");
        }else{
            System.out.println("a is not instanceof Dog");
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.funcCall(new Animal());
    }
}
