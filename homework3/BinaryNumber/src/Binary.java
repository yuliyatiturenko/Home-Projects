
public class Binary {
    public static void main(String[] args) {
        int a = 810;
        String res1 = zapisVstroku(a);
        String BinaryCode = "";
        int j = res1.length();
        for (int i = j - 1; i >= 0; i--) {
            BinaryCode = BinaryCode + res1.charAt(i);
        }
        System.out.println(BinaryCode);

    }

    public static String zapisVstroku(int a) {
        int k = 0;
        String res = "";
        while (a > 0) {
            k = a % 2;
            res = res + "" + k;
            a = a / 2;
        }
        return res;
    }

}







