package homework.students;


public class Main {
    public static void main(String[] args) {


        Student student = new Student("Josh", 22, new City("Odessa", "Ukraine", 65000));
        Student student1 = new Student("Josh", 22, new City("Odessa", "Ukraine", 65300));
        Student student2 = new Student("Olga", 23, new City("Odessa", "Ukraine", 65001));
        Student student3 = new Student("Rid", 19, new City("London", "United Kingdom", 0));

        boolean equalsStudent = student1.equals(student2);
        System.out.println(equalsStudent);
        equalsStudent = student.equals(student1);
        System.out.println(equalsStudent);

    }
}
