public class SumOfNaturalNumbers {
    static int sumNatural(int num){
        return ((num * (num + 1)) / 2);
    }
    public static void main(String[] args) {
        int ans = sumNatural(5);
        System.out.println(ans);
    }
}
