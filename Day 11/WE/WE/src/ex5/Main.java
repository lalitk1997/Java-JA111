package ex5;

public class Main implements Showable{
    @Override
    public void print() {
        System.out.println("void print(); Printable");
    }

    @Override
    public void show() {
        System.out.println("void show(); Showable");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.print();
        obj.show();
    }
}
