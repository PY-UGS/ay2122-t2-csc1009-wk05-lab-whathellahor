package Question1;
public class TestCircleRectangle{
    public static void main (String[] args){
        
        Circle c1 = new Circle(1);
        System.out.println("A cirle created on " + c1.getDateCreated());
        System.out.println(c1.toString());
        System.out.println("The color is " + c1.getColor());
        System.out.println("The radius is " + c1.getRadius());
        System.out.println("The area is " + c1.getArea());
        System.out.println("The diameter is " + c1.getDiameter());

        Rectangle r1 = new Rectangle(2,4);
        System.out.println("A rectangle created on " + r1.getDateCreated());
        System.out.println(r1.toString());
        System.out.println("The area is " + r1.getArea());
        System.out.println("The perimeter is " + r1.getPerimeter());
    }
}