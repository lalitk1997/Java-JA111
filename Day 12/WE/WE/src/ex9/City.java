package ex9;

public enum City {
    // CONSTANT
    DELHI{
        public void message(){
            System.out.println("Welcome user...");
            System.out.println("Capital of India...");
        }
    }, MUMBAI("50 Towers"), CHENNAI, KOLKATA;
    public String numberOfTowers;
    // DEFAULT CONSTRUCTOR
    City(){
        this.numberOfTowers = "100 Towers";
    }
    // PARAMETERIZED CONSTRUCTOR
    City(String numberOfTowers){
        this.numberOfTowers = numberOfTowers;
    }
    // FUNCTION
    public void message(){
        System.out.println("Welcome user...");
    }
}
