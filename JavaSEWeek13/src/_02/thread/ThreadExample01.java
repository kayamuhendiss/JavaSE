package _02.thread;
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println();
        System.out.println("MyThread run");
        System.out.println(Thread.currentThread().getName());

        for (int i=0; i<5; i++){
            System.out.print(i+" ");
        }

    }
}
public class ThreadExample01 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("main..");
        System.out.println(Thread.currentThread().getName());

        MyThread myThread1=new MyThread();  //yeni bir Thread objesi olusturduk.
        myThread1.start(); // yeni bir thread olusturur.(is parcacigi olarak /// lightweight process)

        //thread1.start(); // java.lang.IllegalThreadStateException
        //start metodunu ayni thread objesi icin kullanamayiz legal degildir.

        //run metodunu kendimiz cagirdigimizda yeni bir thread olusmaz(is parcacigi)
        //

        System.out.println();
        myThread1.run();
        myThread1.run();
        myThread1.run();

    }
}
