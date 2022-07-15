package ex9;

public class Main {
    public void printCity(City city){
        if(city != null){
            System.out.println("Our service is available...");
            city.message();
            System.out.println(city.numberOfTowers);
        }else{
            System.out.println("Invalid City");
        }
    }
    public static void main(String[] args) {
        Main m1=new Main();
        m1.printCity(City.DELHI);
    }
}
