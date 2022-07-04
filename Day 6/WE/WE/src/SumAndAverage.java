public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        System.out.println("Array Input : ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("-------");
        int sum = 0;
        for (int val: arr){
            sum += val;
        }
        System.out.println("Sum : "+sum);
        System.out.println("---------");
        double average = ((double)sum)/(double)arr.length;
        System.out.println("Average : "+average);

    }
}
