package _06.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest02 {
    public static void main(String[] args) {
        Pattern p1=Pattern.compile("\\d"); //  \d->digit[0-9]
        Matcher m1=p1.matcher("java8 5test");
        while (m1.find()){
            System.out.println(m1.start());
        }
        System.out.println("///////////////");


        Pattern p2=Pattern.compile("\\D");
        Matcher m2=p2.matcher("java8 5test");
        while (m2.find()){
            System.out.println(m2.start());
        }

        System.out.println("///////////////");


        Pattern p3=Pattern.compile("\\s");  // white-space
        Matcher m3=p3.matcher("java8 5test 3best ");
        while (m3.find()){
            System.out.println(m3.start());
        }
        System.out.println("///////////////");

        Pattern p4=Pattern.compile("\\S");  // non-white-space
        Matcher m4=p4.matcher("java8 5test 3best ");
        while (m4.find()){
            System.out.println(m4.start());
        }
        System.out.println("///////////////");

        Pattern p5=Pattern.compile("8\\s");  //
        Matcher m5=p5.matcher("java8 5test 3best ");
        while (m5.find()){
            System.out.println(m5.start());

        }
        System.out.println("///////////////");

        Pattern p6=Pattern.compile("\\w");  //harf rakam alt cizgi
        Matcher m6=p6.matcher("java8 5test 3best__    ");
        while (m6.find()){
            System.out.println(m6.start());

        }
        System.out.println("///////////////");

        Pattern p7 = Pattern.compile("a.c"); //  . karakteri herhangi bir karakter buraya gelebilir.
        Matcher m7 = p7.matcher("ac abc a c a  ");
        while (m7.find()) {
            System.out.println(m7.start());
        }
    }
}
