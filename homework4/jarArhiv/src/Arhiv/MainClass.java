package Arhiv;


import static Arhiv.Sum2Numbers.sum;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("First number "+ args[0]);
        System.out.println("Second number "+ args[1]);
        int result = sum(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        System.out.println(" Sum is "+ result);

    }
}
