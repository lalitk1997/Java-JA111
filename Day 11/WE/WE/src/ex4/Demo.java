package ex4;

public class Demo implements Printable, Showable{
    @Override
    public void print() {
        System.out.println("void print();");
    }

    @Override
    public void show() {
        System.out.println("void show();");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.print();
        obj.show();
        Printable p = new Demo();
        Demo obj1 = (Demo)p;
        p.print();
        Showable s = new Demo();
        s.show();
    }
}
