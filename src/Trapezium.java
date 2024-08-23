public class Trapezium extends GeometricFigure {
    public double sideA;
    public double sideB;
    public double high;

    public Trapezium(double sideA, double sideB, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }


    public double area() {
        return 0.5 * (sideA + sideB) * high;
    }


    public double perimeter() {
        // Assuming sideC and sideD are the non-parallel sides, you may need additional parameters
        return sideA + sideB + (2 * high); // Simplified example
    }
}
