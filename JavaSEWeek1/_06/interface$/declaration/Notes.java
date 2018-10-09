package _06.interface$.declaration;

public interface Notes {
    //interface metotlari public ve abstract dir
    void testMethod();
}
//interface-> sablon,taslak ozelligi gosterir
//binanin cizimi gibi dusunulebilir

// void testMethod(); //bizim yazdigimiz
// public abstract void testMethod(); //compilerin gordugu
//bir class birden fazla  interface`i uygulayabilir(implements)

class MyRunnable implements Runnable{
       @Override
       public void run() {

       }
   }
