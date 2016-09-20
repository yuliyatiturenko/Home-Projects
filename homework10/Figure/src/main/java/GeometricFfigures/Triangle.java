package GeometricFfigures;


public class Triangle implements Figure {

    private double lengthOfSide;


    public Triangle(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;

    }

    public double area() {

        double area = Math.pow(lengthOfSide, 2) * Math.sqrt(3) / 4;

        return area;
    }

    public double perimeter() {
        double perimeter = 3 * lengthOfSide;

        return perimeter;
    }
}
