package _07.classMembers.declaration.package01;

public class SubData extends Data {
    void test(){

        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar );
      //  System.out.println(privateVar); //legal degil
        // private memberlar class`a aittir, sub class da olsa erisim saglanamaz(gorunur degildir/visible)

    }
}
