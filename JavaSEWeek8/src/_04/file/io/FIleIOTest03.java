package _04.file.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FIleIOTest03 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter=new PrintWriter("PrintWriter");
        printWriter.println("Line1");
        printWriter.println("Line2");
        printWriter.println("Line3");

        printWriter.close();



    }
}
