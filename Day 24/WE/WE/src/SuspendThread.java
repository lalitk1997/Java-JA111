public class SuspendThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside @override method run() ... start ...");
        for (int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println("Exception : "+e);
            }
        }
        System.out.println("End @override method run() ... end ...");
    }

    public static void main(String[] args) {
        SuspendThread obj = new SuspendThread();
        Thread objThread = new Thread(obj);
        objThread.start();
        System.out.println("End of main method ....");
    }
}
