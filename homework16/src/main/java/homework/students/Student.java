package homework.students;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private City city;

    public Student(String name, int age, City city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public City getCity() {
        return city;
    }

    @Override
    public boolean equals(Object student) {
        if (student == null) return false;
        if (student.getClass() != Student.class) return false;
        Student stud = (Student) student;

        if (this.name == null) return false;
        if (this.city.getName() == null) return false;
        boolean nameResult = this.name.equals(stud.name);
        boolean ageResult = this.age == stud.age;
        boolean cityResult = this.city.getName().equals(stud.city.getName());
        return nameResult && ageResult && cityResult;
    }

    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.city;
    }
}
