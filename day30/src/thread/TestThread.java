package thread;

public class TestThread {

	public static void main(String[] args) {
		// 通过继承实现多线程
		Thread a = new ForAthread();
		Thread b = new ForBthread();
		a.start();
		b.start();

		// 通过接口实现多线程
//		Thread b = new Thread(new MyRunnable());
//		a.setName("线程A");
//		b.setName("线程B");
//		a.start();
//		b.start();
//		System.out.println("我是main()函数...");
	}

}
