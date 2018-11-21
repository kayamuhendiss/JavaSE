package _04.thread;

public class SleepTest01 {

    //public static native void sleep(long millis) throws InterruptedException;
//public static void sleep(long millis, int nanos)
//throws InterruptedException {

// sleep metodu static metottur.
// InterruptedException bir checked exceptiondir.

// 1000 ms - 1sn
// 10ˆ6 nanosaniye -> 1 ms

// Thread#sleep metodu verilen sure kadar ilgili threadi suspend/uyutur(TIMED_WAITING)
// belirtilen sure bittiginde thread o anda calismaya devam etmez/bunun bir garantisi yok/
// TIMED_WAITING --> RUNNABLE e gecer
// thread scheduler ilgili threadi tekrar secer ve calistirir.
}
