package ex7;

public enum Item {
    SUGAR, RICE{
        public void itemInfo(){
            System.out.println("This is RICE");
        }
    }, SALT;
    public void itemInfo(){
        System.out.println("Grocery Items...");
    }
}
