package GeometricFfigures;


public class FigureMain {
    public static void main(String[] args) {

        Figure[] geometricFigures = new Figure[]{new Square(5.0), new Triangle(2.0), new Circle(4.0)};
        geometricFiguresArea(geometricFigures);
        geometricFiguresPerimeter(geometricFigures);

    }

    public static void geometricFiguresArea(Figure[] geometricFigures) {
        double geometricFiguresArea = 0;


        for (Figure figure : geometricFigures) {
            geometricFiguresArea = geometricFiguresArea + figure.area();

        }
        System.out.println(" All geometric figures area " + ((double) Math.round(geometricFiguresArea * 100)) / 100);
    }

    public static void geometricFiguresPerimeter(Figure[] geometricFigures) {

        double geometricFiguresPerimeter = 0;

        for (Figure figure : geometricFigures) {

            geometricFiguresPerimeter = geometricFiguresPerimeter + figure.perimeter();
        }
        System.out.println(" All geometric figures perimeter " + ((double) Math.round(geometricFiguresPerimeter * 100)) / 100);

    }
}
