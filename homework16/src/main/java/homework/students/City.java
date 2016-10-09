package homework.students;

public class City {
    private String name;
    private String country;


    private int index;

    public City(String name) {
        this.name = name;
    }

    public City(String name, String country, int index) {
        this.name = name;
        this.country = country;
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.country + " " + this.index;
    }
}
