package ex8;

public class Main {
    public void printSeason(Season season){
        if(season != null){
            System.out.println(season.value);
            System.out.println(season);
        }else{
            System.out.println("Don't enter NULL value...");
        }
    }
    public static void main(String[] args) {
        // System.out.println(new Season(10));
        Main obj = new Main();
        obj.printSeason(Season.SUMMER);
    }
}
