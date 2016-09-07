
public class Min5 {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 2, 4, 8, 9, 6, 11, 55, 1};
        int b = 0;
        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    b = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = b;

                }

            }

        }
        System.out.println(array[0] + "" + array[1] + "" + array[2] + "" + array[3] + "" + array[4]);
    }
}