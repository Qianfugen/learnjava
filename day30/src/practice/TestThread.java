package practice;

public class TestThread {

	public static void main(String[] args) {
		Thread a = new Thread(new MyRunnable());
		Thread b = new Thread(new MyRunnable());
		a.setName("A");
		b.setName("AAAAAAAAAAAAAA");
		a.start();
		b.start();

	}

}
