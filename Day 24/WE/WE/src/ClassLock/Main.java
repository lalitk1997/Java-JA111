package ClassLock;



public class Main {
    public static void main(String[] args) {
        Common c = new Common();
        ThreadA threadA = new ThreadA(c, "Lalit");
        ThreadB threadB = new ThreadB(c, "Kumar");
        threadA.start();
        threadB.start();

    }
}
