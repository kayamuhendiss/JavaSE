package _04.file.io;

import java.io.*;

public class FIleIOTest02 {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("File01.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        bufferedWriter.write("BufferedWriter");
        bufferedWriter.write("\n" +
                "BufferedWriter");
        bufferedWriter.write(" BufferedWriter");
        bufferedWriter.close();
        FileReader fr=new FileReader("File01.txt");
        BufferedReader bufferedReader=new BufferedReader(fr);
        bufferedReader.read();

        String contentLine= null;

        while ((contentLine = bufferedReader.readLine())!=null){
            System.out.println(contentLine);

        }

        bufferedReader.close();



    }
}
