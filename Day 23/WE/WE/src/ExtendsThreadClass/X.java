package ExtendsThreadClass;

public class X extends Thread{

    @Override
    public void run() {
        for (int i=0; i<30; i++){
            System.out.println("Inside run method : "+i);
        }
        System.out.println("end of the run() method...");
    }

    public static void main(String[] args) {
        // Main Thread or Default Thread
        X obj = new X();
        // It will be called as normal method...
        // obj.run();
        obj.start();

        System.out.println("----------------------------");

        for(int i=0; i<30; i++){
            System.out.println("Inside main method()... "+i);
        }
        System.out.println("End of main()");
    }
}
