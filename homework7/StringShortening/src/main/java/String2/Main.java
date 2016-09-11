package String2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner enterWords = new Scanner(System.in);
        System.out.println("Enter your words with space");
        String words = enterWords.nextLine();

        StringShortening longSizeWords;
        longSizeWords= new StringShortening(words);
        String shortSizeWords=longSizeWords.shorteningLongWords();
        System.out.println(shortSizeWords);

    }
}
