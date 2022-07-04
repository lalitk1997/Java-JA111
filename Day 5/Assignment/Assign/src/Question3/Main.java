package Question3;
class Main{
    public static void main(String[] args) {
        Shapes sh = new Shapes();
        sh.area(new Circle(10));
        sh.area(new Rectangle(10, 20));
        sh.area(new Square(20));
    }
}