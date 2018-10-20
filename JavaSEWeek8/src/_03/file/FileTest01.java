package _03.file;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");

        //yeni bir java.io.File objesi olusur
        //bu haliyle,test.txt dosyasi hdd olusmaz!
        System.out.println(file.exists());//boyle bir dosya varmi

        Boolean isCreated=file.createNewFile();
        System.out.println(file.exists());
    }
}
