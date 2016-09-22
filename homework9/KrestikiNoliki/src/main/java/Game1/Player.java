package Game1;


public class Player {
    private boolean determinePlayer = false;
    private String name;
    private int age;
    private char type;

    public Player() {
    }


    public Player(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
        // this.determinePlayer=false;
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

    public boolean isDeterminePlayer() {
        return determinePlayer;
    }

}