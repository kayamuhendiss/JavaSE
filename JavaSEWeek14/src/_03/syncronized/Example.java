package _03.syncronized;

public class   Example {

    public synchronized void method(){

    }
    public void method2(){
        synchronized (this){
            //buraya sadece bir thread girebiliyor
        }
    }

    public static synchronized void method3(){

    }

    // burada kullanilan lock mekanizmasi , java.lang.Class tipindeki ilgili obje
    public static synchronized void method4(){

        /*synchronized (this){
            //buraya sadece bir thread girebiliyor
        }*/
        //Burada this kullanamaz.Onun yerine java.lang.Class tipinde obje var.Her sinifa karsilik.
        //Bunun gosterimi ClassLiteral.class


        synchronized (Example.class){

        }

    }

}
