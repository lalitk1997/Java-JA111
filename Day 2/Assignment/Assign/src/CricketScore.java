public class CricketScore {
    static void calculateScore(int ones, int twos, int threes, int fours, int sixes){
        System.out.println("Total Score : "+(ones+(2*twos)+(3*threes)+(4*fours)+(6*sixes)));
    }
    public static void main(String[] args) {
        calculateScore(10, 4, 1, 4, 2);
    }
}
