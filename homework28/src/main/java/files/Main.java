package files;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "D:\\hillel\\java\\homework\\homework\\homework28\\Students.txt";
        String pathOut = "D:\\hillel\\java\\homework\\homework\\homework28\\Students_out.txt";
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        readAndWriteFile.read(path);
        readAndWriteFile.write(pathOut);

    }


}

