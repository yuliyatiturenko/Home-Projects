
public class Binary {
    public static void main(String[] args) {
        int a = 810, k = 0;
        while (a > 0) {
            k = a % 2;
            System.out.println(k);
            a = a / 2;
        }

    }
}

