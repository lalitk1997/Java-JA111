package Que2;

public class Demo {
    Demo(){
        new Demo("Lalit");
        System.out.println("Demo() Constructor!");
    }
    Demo(String s){
        new Demo(10);
        System.out.println("Demo(String s) Constructor!");
    }
    Demo(int i){
        new Demo(10.00f);
        System.out.println("Demo(int i) Constructor");
    }
    Demo(float f){
        System.out.println("Demo(float f) Constructor");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
