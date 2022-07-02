package Question3;
public class Shapes {
    public void area(Circle circle){
        System.out.println("Circle area : "+(3.14 * circle.radius + circle.radius));
    }
    public void area(Rectangle rectangle){
        System.out.println("Rectangle area : "+(rectangle.length * rectangle.breadth));
    }
    public void area(Square square){
        System.out.println("Square area : "+(square.side) * square.side);
    }
}
