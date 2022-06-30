public class EvenSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println("Even digit sum : (Column-wise)");
        for(int i=0; i<3; i++){ // arr[i].length
            int sum = 0;
            for(int j=0; j<3; j++){ // arr.length
                if(arr[j][i] % 2 == 0){
                    sum += arr[j][i];
                }
                //System.out.println(arr[j][i]);
            }
            System.out.println(sum);
        }
    }
}
