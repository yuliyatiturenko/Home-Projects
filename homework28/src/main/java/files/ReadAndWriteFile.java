package files;

import java.io.*;
import java.util.ArrayList;


public class ReadAndWriteFile {

    ArrayList<Student> listOfStudents = new ArrayList<Student>();

    public void read(String path) throws IOException {

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Student student = new Student();

            int index1 = line.indexOf(' ');
            String line11 = line.substring(index1 + 1);
            student.setLastName(line11);

            String line2 = bufferedReader.readLine();
            int index2 = line.indexOf(' ');
            String line12 = line2.substring(index2 + 1);
            student.setFirstName(line12);

            String line3 = bufferedReader.readLine();
            int index3 = line3.indexOf(' ');
            int line13 = Integer.parseInt(line3.substring(index3 + 1));
            student.setAge(line13);

            String line4 = bufferedReader.readLine();

            listOfStudents.add(student);
        }
        bufferedReader.close();

    }

    public void write(String path) throws IOException {

        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.println("<students>");
        for (Student student : listOfStudents) {
            printWriter.println("  <student>");
            printWriter.println("    <lastname>" + student.getLastName() + "</lastname>");
            printWriter.println("      <firstname>" + student.getFirstName() + "</firstname>");
            printWriter.println("       <age>" + student.getAge() + "</age>");
            printWriter.println("  </student>");
        }
        printWriter.println("</students>");
        printWriter.close();
    }
}



