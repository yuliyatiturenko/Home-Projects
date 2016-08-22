
public class First20numbers {

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0, a = 2; i < array.length; i++, a = a * 2) {
            array[i] = a;

            System.out.println(array[i]);

        }

    }
}
