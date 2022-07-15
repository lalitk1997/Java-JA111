package ex7;

public class Main {
    public static void main(String[] args) {
        Item[] itr = Item.values();
        for(Item itm: itr){
            itm.itemInfo();
            System.out.println(itm);
        }
    }
}
