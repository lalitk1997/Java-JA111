package Que4;

import java.util.ArrayList;
import java.util.List;

public class Test implements Intr{
    @Override
    public List<Integer> display(int p) {
        // int idx = 0;
        List<Integer> arrPrime = new ArrayList<>();
        for(int i=1; i<=p; i++){
            if(checkPrime(i)){
                arrPrime.add(i);
            }
        }
        return arrPrime;
    }

    public boolean checkPrime(int num){
        if(num == 1){
            return false;
        }else if(num == 2){
            return true;
        }else{
            for(int i=2; i<num; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
