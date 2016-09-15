package Fibonachi1;


public class MainFibonachi {
    public static void main(String[] args) {
        int chisloFibonachi = formulaBine(10);
        System.out.println(chisloFibonachi);

    }

    public static int formulaBine(int elementPosledov) {
        double a = (1 + Math.sqrt(5)) / 2;
        double b = (1 - Math.sqrt(5)) / 2;
        double chisloFibonachi = (Math.pow(a, elementPosledov) - Math.pow(b, elementPosledov)) / Math.sqrt(5);
        int chisloFibonachiInt = (int) chisloFibonachi;
        return chisloFibonachiInt;
    }
}
