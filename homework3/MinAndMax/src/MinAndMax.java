
public class MinAndMax {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 5, 4, 5, 4, 8, 9, 6, 11, 25, 23, 55, -8, -6, -5};
        int i = 0;
        int Max = 0, Min = 0;
        for (i = 0; i < array.length; i++) {
            if (Max < array[i]) {
                Max = array[i];
                continue;
            }
        }
        System.out.println("Максимальный элемент массива " + Max);
        for (i = 0; i < array.length; i++) {
            if (Min > array[i]) {
                Min = array[i];
                continue;
            }
        }
        System.out.println("Минимальный элемент массива " + Min);
    }
}
