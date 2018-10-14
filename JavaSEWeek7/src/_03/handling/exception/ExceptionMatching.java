package _03.handling.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMatching {
    public static void main(String[] args)  {
        try {
            FileReader fr=new FileReader("read.txt");
            fr.read();

        }   catch (FileNotFoundException e) {
            e.printStackTrace();

        }
            catch (IOException e) {
            e.printStackTrace();
        }




        // FileNotFoundException IS-A IOException
        // subclass daha onceki catch blogunda olmasi gereklidir.


        /*public FileReader(String fileName) throws FileNotFoundException {
            super(new FileInputStream(fileName));
        }*/

        /*public class FileNotFoundException extends IOException */

        /*public int read() throws IOException*/


    }
}
