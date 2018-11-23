package _05.thread.interaction;

public class WithoutWaitNotifyTest {

    public static void main(String[] args) {
        Calculate calculateThread = new Calculate();
        calculateThread.start();

        System.out.println("After calculate...");
        System.out.println("total is: " + calculateThread.total);
        System.out.println("counter is: " + calculateThread.counter);

    }
}

class Calculate extends Thread {
    int total;
    int counter;

    @Override
    public void run() {

        for (int i = 0; i < 100000; i++) {
            total += i;
            counter = i;
        }

        System.out.println(total);
        System.out.println(counter);

    }
}