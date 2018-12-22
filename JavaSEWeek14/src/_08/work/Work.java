package _08.work;
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread calisiyorr");
        System.out.println("MyThread Adi : "+getName());
    }
}

public class Work {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Calisiyor");


        Thread thread=new MyThread();
        thread.setName("Mythread1");

        thread.start();
        thread.join();


        System.out.println("Main thred calisti....");

    }
}
