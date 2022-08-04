package ThreadSuspendJoin;

public class A implements Runnable{
    int sum = 0;
    @Override
    public void run() {
        // CALCULATE SUM FROM 1 TO 10;
        for(int i=0; i<11; i++){
            sum += i;
        }
    }
}
