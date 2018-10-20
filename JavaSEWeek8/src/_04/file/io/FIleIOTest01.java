package _04.file.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleIOTest01 {
    public static void main(String[] args) throws IOException {
        //FileWriter fileWriter=new FileWriter("abc.txt",true);
        FileWriter fileWriter=new FileWriter("abc.txt",true);
        fileWriter.write("Text");
        fileWriter.write("01");


        fileWriter.close();


        FileReader fileReader=new FileReader("abc.txt");
        char [] charArray=new char[20];
        fileReader.read(charArray);

        for (char c:charArray){
            System.out.println(c);
        }

        fileReader.close();
    }
}
