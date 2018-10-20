package _03.file;

import java.io.File;
import java.io.IOException;

public class FileTest05 {
    public static void main(String[] args) throws IOException {
        File myDir = new File("mydir");
        myDir.mkdir();
        File myFile = new File(myDir, "myFile.txt");
        myFile.createNewFile();
    }
}
