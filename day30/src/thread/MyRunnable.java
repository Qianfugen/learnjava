package thread;

/**
 * 通过接口实现多线程
 * @author 钱富根
 * @version 1.0 2019年8月9日
 */
public class MyRunnable implements Runnable {
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		for(int i=0;i<1000;i++) {
			if(i%10==0) {
				System.out.println("正在执行"+t.getName()+"循环...");
			}
		}
	}
}
