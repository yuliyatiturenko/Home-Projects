import java.util.Scanner;


public class calculator {
    public static void main(String[] args) {

        String operation1 = "addition";
        String operation2 = "subtraction";
        String operation3 = "multip";
        String operation4 = "division";
        String operation5 = "modulo";
        String operation6 = "abs";
        int result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operation, it can be:addition ,subtraction , multip , division , modulo,  abs  ");
        String operationSelect = scanner.nextLine();

        System.out.print("Enter first argument:\t ");
        int firstInt = scanner.nextInt();
        if (operationSelect.equals(operation6)) {
            System.out.println("Result " + Math.abs(firstInt));
            return;
        } else System.out.print("Enter second argument:\t ");
        int secondInt = scanner.nextInt();

        if (operationSelect.equals(operation1)) {
            result = firstInt + secondInt;
        } else if (operationSelect.equals(operation2)) {
            result = firstInt - secondInt;
        } else if (operationSelect.equals(operation3)) {
            result = firstInt * secondInt;
        } else if (operationSelect.equals(operation4)) {
            result = firstInt / secondInt;
        } else if (operationSelect.equals(operation5)) {
            result = firstInt % secondInt;
        } else System.out.println("Wrong operation! ");


        System.out.println("Result " + result);

    }
}

