package _01.garbage.collection;

public class TestPerson2 {
    public static void main(String[] args) {
        Person person=new Person("S","G");
        Person person1=new Person("Z","K");
        //
        person=person1;

        //
        // artik person1 referans degiskeni de person2 referans degiskeninin gosterdigi objeyi gostermekte.
        // bu durumda 1.obje sahipsiz kaldi.
        // boylece 1.obje bu noktadan itibaren temizlenmeye uygun hale geldi.
    }
}
