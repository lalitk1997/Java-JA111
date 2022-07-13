package ex2;

public class Main {
    public static void printSomething(Printer p){
        p.print();
    }
        public static void main(String[] args) {
        ConsolePrinter cp = new ConsolePrinter();
        cp.print();
        Printer p1 = new ConsolePrinter();
        p1.print();
        Printer p2 = new FilePrinter();
        p2.print();
        // Main.printSomething(null); // NullPointerException
    }
}
