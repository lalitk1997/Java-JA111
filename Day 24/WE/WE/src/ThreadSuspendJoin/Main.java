package ThreadSuspendJoin;

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        Thread objThread = new Thread(objA);
        objThread.start();

        try {
            // MAIN THREAD WILL WAIT UNTIL THE EXECUTION OF objThread
            objThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int result = objA.sum;

        for (int i=0; i<10; i++){
            System.out.println("Inside main thread ... ");
            System.out.println(result);
        }

    }
}
