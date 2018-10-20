package _03.file;

import java.io.File;

public class FileTest04 {
    public static void main(String[] args) {
        File file=new File(".");

        String [] fileNames=file.list();
        for (String f:fileNames){
            System.out.println(f);

        }
        File[] fileArray = file.listFiles();

        for (File f : fileArray) {
            if (f.isDirectory()) {
                System.out.println("dir : " + f.getName());
            } else {
                System.out.println("file : " + f.getName());
            }
    }
}}
