public class Main {
    public static void main(String[] args){

        double radius = 5;
        double length = 3;
        double width = 4;
        double side1 = 2;
        double side2 = 2;
        double side3 = 2;

        Circle c = new Circle(radius);
        Rectangle r = new Rectangle(length,width);
        Triangle t = new Triangle(side1,side2,side3);

        System.out.println("Circle Area & Perimeter");
        System.out.println("Radius: " +radius);
        System.out.println("Perimeter: "+ c.getPerimeter());
        System.out.println("Area: "+ c.getArea());


        System.out.println("Rectangle Area & Perimeter");
        System.out.println("Perimeter: "+ r.getPerimeter());
        System.out.println("Area: "+ r.getArea());

        System.out.println("Triangle Area & Perimeter");
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Area: " + t.getArea());





       // System.out.println("Perimeter: "+ c.getPerimeter());
        //System.out.println("Area: "+ c.getArea());
        //System.out.println("Radius: " +radius);
        //double length = 3;
        //double width = 4;
        //Rectangle r = new Rectangle(length,width);
        //System.out.println("Perimeter: "+ r.getPerimeter());
        //System.out.println("Area: "+ r.getArea());
        //double side1 = 2;
        //double side2 = 2;
        //double side3 = 2;
        //Triangle t = new Triangle(side1,side2,side3);
        //System.out.println("Perimeter: " + t.getPerimeter());
        //System.out.println("Area: " + t.getArea());

    }
}
