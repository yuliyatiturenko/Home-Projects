
public class LuckyTicket2 {
    public static void main(String[] args) {

        System.out.println("Lucky Tickets are : ");
        int a, b, c, d, e, f;
        for (int i = 100000; i < 1000000; i++) {

            f = i % 10;
            e = i / 10 % 10;
            d = i / 10 / 10 % 10;
            c = i / 10 / 10 / 10 % 10;
            b = i / 10 / 10 / 10 / 10 % 10;
            a = i / 10 / 10 / 10 / 10 / 10 % 10;

            if (a + b + c == d + e + f) {

                System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);

            }
        }
    }
}
