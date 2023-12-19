public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to

        System.out.println(s1); // which version?
        System.out.println(s1.GetArea()); // which version?
        System.out.println(s1.GetPerimeter()); // which version?
        System.out.println(s1.GetColor());
        System.out.println(s1.IsFilled());
        //System.out.println(s1.GetRadius());
        Circle c1 = (Circle)s1; // downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.GetArea());
        System.out.println(c1.GetPerimeter());
        System.out.println(c1.GetColor());
        System.out.println(c1.IsFilled());
        System.out.println(c1.GetRadius());
        //Shape s2 = new Shape();
        Rectangle s3 = new Rectangle(1.0, 2.0, "RED", false); // upcast
        System.out.println(s3);
        //System.out.println(s3.getArea());
        //System.out.println(s3.getPerimeter());
        //System.out.println(s3.getColor());
        //System.out.println(s3.getLength());

        Rectangle r1 = s3; // downcast
        System.out.println(r1);
        System.out.println(r1.GetArea());
        System.out.println(r1.GetPerimeter());
        System.out.println(r1.GetLenght());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.GetArea());
        System.out.println(s4.GetColor());
        //System.out.println(s4.GetSide());
// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.GetArea());
        System.out.println(r2.GetArea());
        //System.out.println(r2.GetSide());
        System.out.println(r2.GetLenght());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.GetArea());
        System.out.println(sq1.GetColor());
        System.out.println(sq1.GetSide());
        System.out.println(sq1.GetWidth());



    }
}