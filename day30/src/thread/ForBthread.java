package thread;

/**
 * 通过继承实现多线程
 * @author 钱富根
 * @version 1.0 2019年8月9日
 */
public class ForBthread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			if(i%10==0) {
				System.out.println("正在执行线程B循环...");
			}
		}
	}
	
}
