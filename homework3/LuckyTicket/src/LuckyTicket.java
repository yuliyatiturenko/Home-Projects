
public class LuckyTicket {
    public static void main(String[] args) {

        int[] array1 = new int[6];
        int y = 0, k = 0, i = 0;
        for (i = 100000; i <= 999999; i++) {
            y = 0;
            k = i;
            while (k > 0) {
                array1[y] = k % 10;
                y++;
                k = k / 10;
                if (k == 0 && array1[0] + array1[1] + array1[2] == array1[3] + array1[4] + array1[5]) {

                    System.out.println("Lucky ticket " + array1[0] + array1[1] + array1[2] + array1[3] + array1[4] + array1[5]);
                }

            }
        }
    }
}
