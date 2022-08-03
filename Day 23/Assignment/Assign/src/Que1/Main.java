package Que1;

public class Main implements Runnable{
    static int num = 1;

    @Override
    public void run() {
        // System.out.println("Inside run() method....");
        int mul = 1;
        if(Thread.currentThread().getName().equals("Calculate Mul")){
            for (int i=1; i<=10; i++){
                mul *= i;
            }
            num = mul;
            // System.out.println(num);
        }else if(Thread.currentThread().getName().equals("Print Mul")){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        // Single Object Two Threads
        Main obj1 = new Main();

        Thread thread1 = new Thread(obj1);
        thread1.setName("Calculate Mul");
        System.out.println("Calling Thread 1 : ");
        thread1.start();

        Thread thread2 = new Thread(obj1);
        thread2.setName("Print Mul");
        System.out.println("Calling Thread 2 : ");
        thread2.start();
    }
}
