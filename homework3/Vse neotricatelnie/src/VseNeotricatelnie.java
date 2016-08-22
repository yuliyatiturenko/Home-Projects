
public class VseNeotricatelnie {
    public static void main(String[] args) {
        int[] array = new int[50];
        array[0] = 90;
        for (int i = 0; array[i] >= 0; i++, array[i] = (array[i-1] - 5)) {
            System.out.println(array[i]);

        }
    }
}
