package _07.thread.interaction;

class Message {

	private String text;

	public Message(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}

class Waiter implements Runnable {

	Message message;

	public Waiter(Message message) {
		this.message = message;
	}

	@Override
	public void run() {
		synchronized (message) {
			try {
				System.out.println("Waiter is waiting for the notifier at " + Thread.currentThread().getName());
				message.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Waiter is done waiting at : " + Thread.currentThread().getName());
		System.out.println("Waiter got the message:  " + message.getText());
	}

}

class Notifier implements Runnable {

	Message message;

	public Notifier(Message message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println("Notifier is sleeping for 3 seconds at ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		synchronized (message) {
			message.setText("Notifier took a nap for 3 seconds");
			System.out.println("Notifier is notifying waiting thread to wake up at ");
			message.notifyAll();
		}

	}

}

public class WaitNotifyExample {

	public static void main(String[] args) {

		Message message = new Message("Hello  notify test");

		Waiter waiter = new Waiter(message);
		
		Thread waiterThread = new Thread(waiter, "waiterThread");
		waiterThread.start();

		Thread waiterThread2 = new Thread(waiter, "waiterThread2");
		waiterThread2.start();

		Thread waiterThread3 = new Thread(waiter, "waiterThread3");
		waiterThread3.start();

		Notifier notifier = new Notifier(message);
		Thread notifierThread = new Thread(notifier, "notifierThread");
		notifierThread.start();

	}

}