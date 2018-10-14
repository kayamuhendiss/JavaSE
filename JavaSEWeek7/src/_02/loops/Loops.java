package _02.loops;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("name1","name2","name3");

        for (String e:list){
            System.out.println(e);
        }
        //Java8
        list.forEach(System.out::println);


    }
    /*while(expression {
 }*/

 /*do while

 for( initialization ; condition ; iteration){
        cok fazla ic ice dongu yapmak yerine azaltabiliyor muyuz dusunmek iyi
        olacaktir.
    }




for (declaration : expression )*/
}
