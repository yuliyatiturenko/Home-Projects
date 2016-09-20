package GeometricFfigures;


public class Circle implements Figure {
    private double radiusCircle;

    public Circle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    public double area() {
        double area = Math.pow(radiusCircle, 2) * Math.PI;

        return area;
    }

    public double perimeter() {
        double perimeter = 2 * radiusCircle * Math.PI;

        return perimeter;
    }
}
