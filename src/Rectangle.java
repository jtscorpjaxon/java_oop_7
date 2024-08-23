public class Rectangle extends GeometricFigure {
    public double sideA;
    public double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    public double area() {
        return sideA * sideB;
    }


    public double perimeter() {
        return 2 * (sideA + sideB);
    }
}
