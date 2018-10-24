package _06.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest03 {
    public static void main(String[] args) {
        //Quantifier
        // * -> {0,} 0 ya da daha fazla
        // + -> {1,} 1 yada daha fazla
        // ? -> {0,1} 0 ya da
        // {X}
        // {X,Y}


        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher("java88 57test 658best");
        while (m.find()){
            System.out.println(m.start()+" : "+m.group());
        }

        Pattern p1=Pattern.compile("\\d?");
        Matcher m1=p1.matcher("java88 57test 658best");
        while (m1.find()){
            System.out.println(m1.start()+" : "+m1.group());
        }

        Pattern p2=Pattern.compile("\\d*");
        Matcher m2=p2.matcher("java88 57test 658best");
        while (m2.find()){
            System.out.println(m2.start()+" : "+m2.group());
        }
        Pattern p3=Pattern.compile("\\d{2}");
        Matcher m3=p3.matcher("java88 57test 658best");
        while (m3.find()){
            System.out.println(m3.start()+" : "+m3.group());
        }
        Pattern p4=Pattern.compile("\\d{2,3}");
        Matcher m4=p4.matcher("java88 57test 658best");
        while (m4.find()){
            System.out.println(m4.start()+" : "+m4.group());
        }
    }
}
