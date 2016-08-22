
public class SummaChetNechet {
    public static void main(String[] args) {
        int[] array = {-1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int i = 0;
        int SumChet = 0, SumNechet = 0;
        for (i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                SumChet = SumChet + array[i];
            } else SumNechet = SumNechet + array[i];
        }
        System.out.println(SumChet);
        System.out.println(SumNechet);
    }
}
