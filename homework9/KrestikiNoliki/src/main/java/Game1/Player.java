package Game1;


abstract class Player {
    private String name;
    private int age;
    private char type;

    public Player(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;

    }

    public Player() {

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

    abstract String enterMove();

}