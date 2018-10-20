package _03.file;

import java.io.File;
import java.io.IOException;

public class FileTest03 {
    public static void main(String[] args) throws IOException {
        File file=new File("xyz.rar");
        file.createNewFile();

        file.delete();

        File file2=new File("xyzt.rar");
        file2.createNewFile();

        File fileNewName=new File("newName.rar");
        file2.renameTo(fileNewName);


    }
}
