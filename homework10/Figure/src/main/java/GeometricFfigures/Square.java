package GeometricFfigures;


public class Square implements Figure {
    private double lengthOfSide;

    public Square(double lengthOfSide) {

        this.lengthOfSide = lengthOfSide;
    }

    public double area() {
        double area = Math.pow(lengthOfSide, 2);

        return area;
    }

    public double perimeter() {
        double perimeter = 4 * lengthOfSide;

        return perimeter;
    }
}
