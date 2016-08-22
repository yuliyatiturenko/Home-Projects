
public class ArrayVse4Znachnie {
    public static void main(String[] args) {

        int[] array = new int[3001];
        array[0] = 1000;
        int i = 0;
        while (array[i] < 10000) {

            System.out.println(array[i]);
            i++;
            array[i] = array[0] + (i * 3);

        }

    }
}
