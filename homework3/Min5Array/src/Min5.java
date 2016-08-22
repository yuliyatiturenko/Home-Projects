
public class Min5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 5, 4, 5, 4, 8, 9, 6, 11, 25, 23, 55, -8, -6, -5};
        int i = 0;
        int Min = 0;

        for (i = 0; i < array.length; i++) {
            if (Min > array[i]) {
                Min = array[i];
                continue;
            }
        }
        System.out.println("Минимальный элемент массива " + Min);
    }
}
