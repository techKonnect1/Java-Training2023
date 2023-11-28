
public class Triangle extends Shape {
    private double Triangle;
    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }
    public double getArea() {
        return 0.5 * (side1 * side2);

    }
}

