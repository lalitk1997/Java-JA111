package ThreadName;

public class Main {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();

        Thread objta = new Thread(ta);
        Thread objtb = new Thread(tb);

        // objta.start();
        // objtb.start();

        objta.setName("Alpha");
        objtb.setName("Beta");

        objta.start();
        objtb.start();
    }
}
