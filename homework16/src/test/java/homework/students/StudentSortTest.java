package homework.students;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class StudentSortTest {
    List<Student> students = new ArrayList<Student>();
    List<Student> students1 = new ArrayList<Student>();
    List<Student> students2 = new ArrayList<Student>();

    @Before
    public void setUp() {

        Student student = new Student("Josh", 22, new City("Kiev", "Ukraine", 65000));
        Student student1 = new Student("Bob", 25, new City("Lvov", "Ukraine", 65300));
        Student student2 = new Student("Olga", 23, new City("Odessa", "Ukraine", 65001));
        Student student3 = new Student("Rid", 19, new City("London", "United Kingdom", 0));
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students1.add(student1);
        students1.add(student2);
        students1.add(student);
        students1.add(student3);
        students2.add(student);
        students2.add(student3);
        students2.add(student1);
        students2.add(student2);
    }

    @Test
    public void sortByAgeTest() {
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        boolean result = students.equals(students1);
        assertThat(result, is(true));

    }

    @Test
    public void sortByCityTest() {
        Collections.sort(students, (o1, o2) -> o1.getCity().getName().compareTo(o2.getCity().getName()));
        boolean result = students.equals(students2);
        assertThat(result, is(true));

    }

    @Test
    public void sortByAgeNewClassComparatorTest() {
        StudentAgeComparator studentAgeComparator = new StudentAgeComparator();
        Collections.sort(students, studentAgeComparator);
        boolean result = students.equals(students1);
        assertThat(result, is(true));

    }

}
