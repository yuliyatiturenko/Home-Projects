package Game1;

import java.util.Scanner;

public class Human extends Player {
    Scanner scanner = new Scanner(System.in);


    private String name;
    private int age;
    private char type;
    public Human(){}

    public Human(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;

    }
    public Human(String name,char type){
        this.name=name;
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String enterMove() {

        System.out.println("Player moves...");
        System.out.println("Enter your move: ");
        return scanner.next();
    }
}
