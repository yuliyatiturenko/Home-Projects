package Game1;


import java.util.Random;
import java.util.Scanner;

public class EnterMove {
    public static String getMoveFromConsole(Scanner scanner) {
        System.out.println("Player moves...");
        System.out.println("Enter your move: ");
        return scanner.next();
    }

    public static String getMoveFromRandom(Random random) {
        System.out.println("Computer moves...");
        String result = "";
        for (int i = 0; i < 2; i++) {
            result += String.valueOf(random.nextInt(3));
        }
        System.out.println(result);
        return result;
    }
}
