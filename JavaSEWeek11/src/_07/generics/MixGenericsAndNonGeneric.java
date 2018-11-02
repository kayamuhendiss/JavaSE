package _07.generics;

import java.util.ArrayList;
import java.util.List;

public class MixGenericsAndNonGeneric {
    public static void main(String[] args) {

        List<Integer> intList=new ArrayList<>();
        intList.add(100);
        addElement(intList);
        System.out.println(intList);

        // generic yapisi sadece compile time da calismaktadir.
        // runtimeda generic yapisi silinir/diamond isaretleri ucar.
        // boylece ilgili collection yapisi nonGeneric hale gelir.
        // her zaman generic yapisini tercih edelim!
        // nonGeneric ile generic yapisini karistirmayalim. boylece calisma zamaninda hata almayiz!

        for(int n : intList){
            System.out.println(n);
        }


    }

    public  static  void addElement(List nonGeneric){
        nonGeneric.add("String1");
    }
}
