package _04.thread;

class MyThread extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("Thread name: " + Thread.currentThread().getName() +" : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ThreadSleepTest {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread(); 
        MyThread thread3 = new MyThread();
        MyThread thread4 = new MyThread();

        thread1.setName("thread1");
        thread2.setName("thread2");
        thread3.setName("thread3");
        thread4.setName("thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        //Thread.yield();
    }
}
