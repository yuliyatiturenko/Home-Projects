
public class min_from_3 {
    public static void main(String[] args) {

        int a = 7;
        int b = 3;
        int c = 9;
        int d, min;
        if (a < b) d = a;
        else d = b;
        if (d < c) min = d;
        else min = c;
        System.out.println("Minimum from a and b " + min);
    }
}
