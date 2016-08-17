
import java.util.Scanner;

public class tips {
    public static void main(String[] args) {

        String operation1 = "terrible";
        String operation2 = "poor";
        String operation3 = "good";
        String operation4 = "great";
        String operation5 = "excellent";
        double result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bill sum :\t ");
        double billSum = scanner.nextDouble();
        System.out.print("Enter degree of services, it can be: terrible ,poor , good , great , excellent  \t");
        String serviceDegree = scanner.next();
        scanner.close();

        if (serviceDegree.equals(operation1)) {
            result = billSum;
        } else if (serviceDegree.equals(operation2)) {
            result = billSum + 0.05 * billSum;
        } else if (serviceDegree.equals(operation3)) {
            result = billSum + 0.1 * billSum;
        } else if (serviceDegree.equals(operation4)) {
            result = billSum + 0.15 * billSum;
        } else if (serviceDegree.equals(operation5)) {
            result = billSum + 0.2 * billSum;
        } else System.out.println("Wrong degree! ");


        System.out.println("Result bill sum " + result);

    }
}

