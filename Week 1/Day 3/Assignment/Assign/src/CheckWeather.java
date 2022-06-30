public class CheckWeather {
    static void wheatherStatus(boolean isSnowing, boolean isRaining, double temperature){
        if(isSnowing && isRaining && temperature < 50.0){
            System.out.println("Let's stay home.");
        }else{
            System.out.println("Let's go out!");
        }
    }
    public static void main(String[] args) {
        boolean isSnowing = true;
        boolean isRaining = true;
        double temperature = 49.9;
        wheatherStatus(isSnowing, isRaining, temperature);
        wheatherStatus(false, true, 49);
    }

}
