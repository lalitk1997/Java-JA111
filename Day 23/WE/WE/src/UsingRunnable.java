public class UsingRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Inside run() : "+i);
        }
        System.out.println("End of run()...");
    }

    public static void main(String[] args) {
        // Main Thread or Default Thread
        UsingRunnable obj = new UsingRunnable();
        Thread thr = new Thread(obj);
        thr.start();

        for (int i=10; i<20; i++){
            System.out.println("Inside main of ThreadA "+i);
        }
    }
}
