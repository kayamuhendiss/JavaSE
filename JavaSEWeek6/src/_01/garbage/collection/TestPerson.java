package _01.garbage.collection;

public class TestPerson {
    public static void main(String[] args) {
        Person person=new Person("z","k");


        //

        //
        //
        //
        //
        person=null;
        //bu adima kadar person referans degiskeni heapteki objeyi gostermektedir.
        //objenin bir sahibi oldugu icin obje bu adima kadar temizlenemez/silinemez.
        // burada person null yaptigimizda ilgili baglanti kopar , obje sahipsiz kalir.
        // bu noktadan sonra obje temizlenmeye/silinmeye uygun hale gelecektir.
        // hemen bu adimda temizlenecegin garantisi yok.
        //
        //
    }
}
