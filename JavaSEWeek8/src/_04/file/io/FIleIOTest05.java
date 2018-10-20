package _04.file.io;

import java.io.*;

public class FIleIOTest05 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bufferedStream.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("mycontent".getBytes());
        bos.close();

        FileInputStream fis = new FileInputStream("bufferedStream.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        while(bis.available()>0){
            int unicode = bis.read();
            System.out.println(unicode + ":" + (char) unicode);
        }

        bis.close();
    }
}
