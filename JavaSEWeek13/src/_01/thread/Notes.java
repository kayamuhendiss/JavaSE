package _01.thread;

public class Notes {

     // thread dedigimizde aklimiza 2 kavram gelir;

    // 1)java.lang.Thread sinifi ve objesi
    // 2)calisan is parcacigi/lightweight process

    // java.lang.Thread IS-A java.lang.Object onermesi dogrudur.

    // calisan is parcacigi olarak , kendi stack alanina sahip lightweight processler.
    //

    // process -> Isletim sistemi acisindan , calisan programlar uygulamalardir ( eclipse , word , chrome , reader vs..)
    // bir process icin N tane thread kosabilir/calisabilir.

    // java da basit bir hello world orneginde bile thread olusur. (main threadi olusur.)


    // JVM -> java virtual machine , bir nevi isletim sistemi gibi(OS) calisir.
    // threadlerin yonetminden / schedule edilmesinden JVM sorumludur.

    // Thread olusturmak icin 2 farkli yaklasim vardir;

    // 1) java.lang.Thread sinifini kalitmak (extends)
    // 2) java.lang.Runnable arabirimini implements /uygulamak

}
