package _04.deadlock;

public class TestThread {
	
	public static Object LockA = new Object();
	public static Object LockB = new Object();

	public static void main(String args[]) {

		ThreadDemo1 thread1 = new ThreadDemo1();
		ThreadDemo2 thread2 = new ThreadDemo2();
		
		thread1.start();
		thread2.start();
	}

	private static class ThreadDemo1 extends Thread {
		public void run() {
			
			synchronized (LockA) {
				System.out.println("Thread 1: Holding lock A...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1: Waiting for lock B...");
				synchronized (LockB) {
					System.out.println("Thread 1: Holding LockA & LockB...");
				}
			}
			
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			
			synchronized (LockB) {
				System.out.println("Thread 2: Holding LockB...");
//				try {
//					Thread.sleep(10);
//				} catch (InterruptedException e) {
//				}
				System.out.println("Thread 2: Waiting for LockA...");
				synchronized (LockA) {
					System.out.println("Thread 2: Holding LockA & LockB...");
				}
			}
		}
	}
}