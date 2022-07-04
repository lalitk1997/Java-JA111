public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Using For Loop : ");
        for (int i = 0; i < a.length; i++) {
            for(int j=0; j<a[i].length; j++){
                System.out.println(a[i][j]);
            }
        }
        System.out.println("Using foreach loop : ");
        for(int[] val: a){
            // System.out.println(val);
            for(int num: val){
                System.out.println(num);
            }
        }
    }
}
