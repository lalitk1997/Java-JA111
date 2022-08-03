package MultipleThreadSimu;

public class Main {
    public static void main(String[] args) {
        ThreadA objA = new ThreadA();
        ThreadB objB = new ThreadB();
        ThreadC objC = new ThreadC();
        objA.start();;
        objB.start();
        objC.start();
        // Main Thread or Default Thread
        for (int i=70; i<80; i++){
            System.out.println("Inside class Main:run() method : "+i);
        }
        System.out.println("end of Main");
    }
}
