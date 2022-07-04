public class PrimeNumber {
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        // int size = inputArray.length;
        // int[] prime = new int[size];
        int size = 0;
        for(int i=0; i<inputArray.length; i++){
            if(isPrime(inputArray[i])){
                size++;
            }
        }
        int[] prime = new int[size];
        int idx = 0;
        for(int i=0; i<inputArray.length; i++){
            if(isPrime(inputArray[i])){
                prime[idx] = inputArray[i];
                idx++;
            }
        }
        if(size == 0){
            return null;
        }else{
            return prime;
        }
    };
    public boolean isPrime(int num){
        if(num == 1){
            return false;
        }else if(num == 2){
            return true;
        }else{
            for(int i=2; i<num-1; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    };
    public static void main(String[] args){
        PrimeNumber obj = new PrimeNumber();
        int[] arr = {10,12,5,11,50,14,15};
        if(obj.findAndReturnPrimeNumbers(arr) == null){
            System.out.println("No Prime Number!");
        }else{
            for(int i=0; i<obj.findAndReturnPrimeNumbers(arr).length; i++){
                System.out.print(obj.findAndReturnPrimeNumbers(arr)[i]+" ");
            }
        }
    }
}
