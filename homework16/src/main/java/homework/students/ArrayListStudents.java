package homework.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListStudents {
    public static void main(String[] args) {

        Student student = new Student("Josh", 22, new City("Kiev", "Ukraine", 65000));
        Student student1 = new Student("Bob", 25, new City("Lvov", "Ukraine", 65300));
        Student student2 = new Student("Olga", 23, new City("Odessa", "Ukraine", 65001));
        Student student3 = new Student("Rid", 19, new City("London", "United Kingdom", 0));

        List<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

        //сортировка по умолчанию
        Collections.sort(students);
        System.out.println("Default sort " );
        System.out.println(students);

        //сортировка по возрасту(в обратном порядке)
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println("Sorted by age ");
        System.out.println(students);

        //сортировка по возрасту с дополнительным классом
        StudentAgeComparator studentAgeComparator = new StudentAgeComparator();
        Collections.sort(students, studentAgeComparator);
        System.out.println("Sorted by age with additional class ");
        System.out.println(students);

        //сортировка по городу
        Collections.sort(students, (o1, o2) -> o1.getCity().getName().compareTo(o2.getCity().getName()));
        System.out.println("Sorted by city ");
        System.out.println(students);

    }
}
