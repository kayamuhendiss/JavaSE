package _08.work;
class NewThread1 implements Runnable{

    String name; //kanalin adi
    Thread t;

    NewThread1(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();
    }

    @Override
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(name + " " + i);
                t.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name + " Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        new NewThread1("One");
        new NewThread1("Two");
        new NewThread1("Three");
        try{
            //diger kanallarin bitmesini bekle
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}


