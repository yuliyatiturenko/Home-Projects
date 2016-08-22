
public class SummaElementov {
    public static void main(String[] args) {

        int[] array = {5, 5, 5, 5, 5, 9, 2, -5, -6, 8, 9, 2, 3};
        int n = 5;
        int Sum, i;
        for (i = 0, Sum = 0; i < n; i++) {
            Sum = Sum + array[i];
        }
        System.out.println("Сумма первых "+n+" элементов массива равна " +Sum);
    }
}
