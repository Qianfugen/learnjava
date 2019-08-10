package practice;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		for(int i=0;i<1000;i++) {
			if(i%10==0) {
				System.out.println(System.currentTimeMillis()+" 线程"+t.getName()+" 正在运行...");
			}
		}
		
	}
	
}
