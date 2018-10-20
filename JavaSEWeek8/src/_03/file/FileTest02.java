package _03.file;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File file1=new File("folder");
        file1.mkdir();

       /* System.out.println(file1.isDirectory());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.isFile());
        System.out.println(file1.isHidden());
        System.out.println(file1.getParent());*/


        File file2=new File(file1,"abc.txt");
        file2.createNewFile();
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.lastModified());
    }
}
