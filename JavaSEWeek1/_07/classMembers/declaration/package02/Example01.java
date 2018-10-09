package _07.classMembers.declaration.package02;
//diger paketi import edebilmek icin  sinifin public olmasi gerekir
import _07.classMembers.declaration.package01.Data;

public class Example01 {
    public static void main(String[] args) {

        Data dataObject= new Data();
        System.out.println(dataObject.publicVar);
        dataObject.publicMethod();
        //farkli paketlerden sadece public degiskenlere ve public metotlarina erisim saglanabilir

//        System.out.println(dataObject.defaultVar);
//        System.out.println(dataObject.protectedVar);
//        System.out.println(dataObject.privateVar);

    }

}
