package _07.classMembers.declaration.package01;

public class Example02 {
    public static void main(String[] args) {
        Data dataObject1=new Data();
        //Ayni pakette oldugumuz zaman public, private,protected erisim saglanabilir
        System.out.println(dataObject1.publicVar);
        dataObject1.publicMethod();
        System.out.println(dataObject1.defaultVar);
        System.out.println(dataObject1.protectedVar);
        //System.out.println(dataObject1.privateVar); Erisim Saglanamaz!
    }
}
