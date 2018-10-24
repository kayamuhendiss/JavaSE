package _06.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest01 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("a");
        Matcher m=p.matcher("java");

        while (m.find()){
            System.out.println(m.start());
        }

        System.out.println("/////////////");

        Pattern pp=Pattern.compile("av");
        Matcher mm=pp.matcher("java");

        while (mm.find()){
            System.out.println(mm.start());
        }
        System.out.println("/////////////");

        Pattern p1=Pattern.compile("a|v"); // a ya da v
        Matcher m1=p1.matcher("java");
        while (m1.find()){
            System.out.println(m1.start());
        }
        System.out.println("/////////////");

        Pattern p2=Pattern.compile("[av]"); //veya anlaminda ama karakter karakter ayirir
        Matcher m2=p2.matcher("java");
        while (m2.find()){
            System.out.println(m2.start());
        }
        System.out.println("/////////////");

        Pattern p3=Pattern.compile("[a-k]");  // a | b | c .... | k
        Matcher m3=p3.matcher("java");
        while (m3.find()){
            System.out.println(m3.start());
        }
        System.out.println("/////////////");

        Pattern p4 = Pattern.compile("ab"); //
		Matcher m4 = p4.matcher("abababac");
		while (m4.find()) {
			System.out.println(m4.start());
		}

        System.out.println("/////////////");

        Pattern p5 = Pattern.compile("aba"); //
        Matcher m5 = p5.matcher("abababac");
        while (m5.find()) {
            System.out.println(m5.start());
        }

    }
}
