package ex5;

public enum Color implements Inter{
    RED, GREEN, BLUE;

    /*
    @Override
    public String toString() {
        return "Color{}";
    }
    */

    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        System.out.println(c1);
        System.out.println(c1.toString());
        //System.out.println(Color.values());
    }
}
