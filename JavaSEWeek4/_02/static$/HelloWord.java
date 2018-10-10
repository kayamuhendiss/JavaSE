package _02.static$;

public class HelloWord {
    private  String message="Deneme"; //bu degisken jnstant degisken
    //static degilse ve metot icerisinde degilse instance degiskendir
    //ve instance degiskenler objeye aittir.
    public static void main(String[] args) {

        //Cannot make a static reference to the non-static field message
        //static methodlardan non-static degiskenlere (instance variable) ya da instance methodlara direkt erisim SAGLANAMAZ!
        //System.out.println(message);
       HelloWord helloWord=new HelloWord();
        System.out.println(helloWord.message);
    }
}
