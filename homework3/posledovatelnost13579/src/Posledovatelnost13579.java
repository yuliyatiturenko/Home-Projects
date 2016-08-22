
public class Posledovatelnost13579 {
    public static void main(String[] args) {
        int[] array = new int[55];
        array[0] = 1;
        int i = 0;
        while (i < array.length) {
            array[i] = array[0] + 2*i;
            System.out.println(array[i]);
            i++;
        }

    }
}
