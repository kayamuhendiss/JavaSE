package _02.thread;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println();
        System.out.println("MyRunnable#run");
        System.out.println(Thread.currentThread());

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class ThreadExample02 {
    public static void main(String[] args) {
       MyRunnable runnable=new MyRunnable();
        runnable.run(); // bu islem yeni bir thred baslatmaz!
        //
        MyRunnable runnable2 = new MyRunnable();

        Thread thread1= new Thread(runnable);
        thread1.start();
        //thread1.start();

        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}

//ornegi calistirdigimizda OUTPUT un hangi sirada olacaginin bir garantisi yoktur.
//cunku her bir threadin ne kadar , ne zaman calisacagini bilmiyoruz.
//bunun yonetimi JVM'in kontrolu altindadir!

// JVM icerisinde Thread Scheduler mekanimzasi bulunmakatdir.
// hangi threadin calisacagina bu yapi karar verir.
// threadlerin state leri var , runnable state sahip thread arasindan secim yapar ve thread calisir.

