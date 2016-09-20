package GeometricFfigures;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FigureMainTest {
    Square square = new Square(5.0);
    Triangle triangle = new Triangle(2.0);
    Circle circle = new Circle(4.0);

    @Test
    public void areaCircleTest() {
        double areaCircle = circle.area();
        assertThat(areaCircle, is(50.26548245743669));
    }

    @Test
    public void areaSquareTest() {
        double areaSquare = square.area();
        assertThat(areaSquare, is(25.0));
    }

    @Test
    public void areaTriangleTest() {
        double areaTriangle = triangle.area();
        assertThat(areaTriangle, is(1.7320508075688772));
    }

    @Test
    public void perimeterCircleTest() {
        double perimeterCircle = circle.perimeter();
        assertThat(perimeterCircle, is(25.132741228718345));
    }

    @Test
    public void perimeterSquareTest() {
        double perimeterSquare = square.perimeter();
        assertThat(perimeterSquare, is(20.0));
    }

    @Test
    public void perimeterTriangleTest() {
        double perimeterTriangle = triangle.perimeter();
        assertThat(perimeterTriangle, is(6.0));
    }
}
