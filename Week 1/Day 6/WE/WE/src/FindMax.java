public class FindMax {
    // NON-STATIC METHOD
    int arrMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FindMax obj = new FindMax();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(obj.arrMax(arr));
    }
}
