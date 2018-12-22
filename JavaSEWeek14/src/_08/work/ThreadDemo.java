package _08.work;

class NewThread implements Runnable {

    Thread t;

    NewThread(){
        //Yeni, ikinci bir kanal olustur
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); //kanali baslat
    }

    //Bu, ikinci kanal icin giris noktasidir
    @Override
    public void run() {
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread");
    }

}

public class ThreadDemo {

    public static void main(String[] args) {
        new NewThread(); //yeni bir kanal olustur

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
