package _03.thread;

public class Notes {


    //

// NEW
// yeni bir Thread objesi olusturdugumuzda threadin durumu NEW dir
// Thread state for a thread which has not yet started.
// Thread1 thread= new Thread1();

// RUNNABLE
// start metodunu cagirdigimizda ilgili thread icin NEW --> RUNNABLE durumuna gecis olacaktir.
// Thread , RUNNABLE durumunda alive durumundadir.
// RUNNABLE durumu , threadin calismaya elverisli oldugu durumdur.
// bir threadin , thread scheduler tarafindan secilebilmesi icin mutlaka RUNNABLE durumda olmasi gerekir.

// RUNNING
// RUNNING den kastimiz -> Thread scheduler tarafindna scecilen runnable thread.
// hali hazirda calisan thread in durumu.


// WAITING
// WAITING durumundaki bir thread calismaya uygun halde degildi. yani thread scheduler tarafindan secilemez.
// burada thread alive (canli) durumdadir.

// java.lang.Object
//   public final void wait() throws InterruptedException {

// java.lang.Thread
// public final void join() throws InterruptedException {

// TIMED_WAITING
// bu durumda WAITING state gibi , threadin calismasina uygun halde olmadigi bir state
//
// belli zamana kadar waiting durumu olur.

//    public final native void wait(long timeout) throws InterruptedException;
//    public final void wait(long timeout, int nanos) throws InterruptedException {

//     public final synchronized void join(long millis)

//   public static native void sleep(long millis) throws InterruptedException;

// BLOCKED
// synchronized bir block'a ya da metotada ayni anda bir thread girebilir.
// N tane thread olsun , ayni X objesi uzerinden calissin,
// synchronized bir metoda sadece 1 tane thread girebilir , N-1 thread BLOCKED durumundadir.
// ilgili thread isini bitirenede kadar bir baska thread bu metoda/blocka giris yapamaz.

// objenin kilidini ele gecirir.

// TERMINATED/DEAD
// TERMINATED durumuna gecen bir thread isini tamamlamistir.
// Tekrar RUNNABLE duruma gecis yapamaz.


}
