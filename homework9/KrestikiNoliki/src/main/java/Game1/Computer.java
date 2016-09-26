package Game1;


import java.util.Random;

public class Computer extends Player {

    Random random = new Random();

    public Computer() {
        super("AsusX756U", 2016, 'O');
    }

    @Override
    public String enterMove() {
        System.out.println("Computer moves...");
        String result = "";
        for (int i = 0; i < 2; i++) {
            result += String.valueOf(random.nextInt(3));
        }
        System.out.println(result);
        return result;
    }

}