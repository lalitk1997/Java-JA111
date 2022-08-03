package ThreadPriority;

public class Main extends Thread{
    @Override
    public void run() {
        System.out.println("Inside run() method ....");
    }

    public static void main(String[] args) {

        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = new Main();

        System.out.println("Default priority set by the scheduler : ");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);

        System.out.println("----------------------------------");
        System.out.println("After changing the priority : ");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        System.out.println("Default Thread Name : "+Thread.currentThread().getName());
        System.out.println("Default Thread Priority : "+Thread.currentThread().getPriority());


    }
}
