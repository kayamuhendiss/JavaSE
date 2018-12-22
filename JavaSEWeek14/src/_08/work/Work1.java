package _08.work;
class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("benim Thread Calismakta");
    }
}

public class Work1 {
    public static void main(String[] args) {

        System.out.println("Main Thread Calismakta");

        Thread1 thread1=new Thread1();
        Thread thread=new Thread(thread1);
        thread.start();



        System.out.println("Main Thread Calismakta");

    }
}
