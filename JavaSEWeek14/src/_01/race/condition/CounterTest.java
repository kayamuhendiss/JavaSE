package _01.race.condition;


class Counter implements Runnable {

    @Override
    public void run() {
        increment();
        increment();
        increment();
        increment();
        increment();
        increment();
        increment();
        increment();

        decrement();
        decrement();
        decrement();
        decrement();
        decrement();
        decrement();
        decrement();
        decrement();
    }

    int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }

}

class CounterTest {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        Thread t3 = new Thread(counter);
        Thread t4 = new Thread(counter);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(counter.c);

    }

}