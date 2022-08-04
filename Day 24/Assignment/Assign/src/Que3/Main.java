package Que3;

public class Main {
    public static void main(String[] args) {
        ThreadEven objE = new ThreadEven();
        ThreadOdd objO = new ThreadOdd();

        objE.setName("Even-Thread");
        objO.setName("Odd-Thread");

        try {
            objO.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        objO.start();
        objE.start();
    }
}
