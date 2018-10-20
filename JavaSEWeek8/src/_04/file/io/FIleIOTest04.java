package _04.file.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleIOTest04 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        // Reader/Writer siniflari karaktere yoneliktir. (Character)
        // InputStream/OutputStream siniflari ise byte yoneliktir.


        String content="ZuleyhaKaya";
        byte []byteArray=content.getBytes();

        FileOutputStream fos=new FileOutputStream("fileOutput.txt");
        fos.write(byteArray);
        fos.close();
        FileInputStream fis = new FileInputStream("fileOutput.txt");

        while (fis.available() > 0) {
            int unicode = fis.read();
            System.out.println(unicode + ":" + (char) unicode);
        }

        fis.close();
    }
}
