package _07.generics;

import java.util.ArrayList;
import java.util.List;

public class Notes {
    public static void main(String[] args) {
        List nonGeneric=new ArrayList();
        nonGeneric.add("Zuleyha");
        nonGeneric.add(100);
        nonGeneric.add(true);
        System.out.println(nonGeneric);


        // ClassCastException
        int number=(int)nonGeneric.get(1);


        // generic yapisi ;
        // 1) derleme zamaninda tip kontrolu /type check saglar!
        // 2) cast etme islemini ortadan kaldirir ve runtime de exception
        // almamizi engeller.


        List<Integer> generic=new ArrayList<>();
        generic.add(100);
        generic.add(300);

        Integer number1=generic.get(1);
        System.out.println(number1);



    }
}
