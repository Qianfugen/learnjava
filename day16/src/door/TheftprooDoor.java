package door;

/**
 * 子类防盗门 TheftprooDoor，分别继承了Door和实现接口Lock
 * @author root
 *
 */
public class TheftprooDoor extends Door implements Lock{
	
	public void openLock() {
		System.out.println("开锁，左三圈，拔钥匙");
	}
	
	public void lockUp() {
		System.out.println("上锁,右三圈,拔钥匙");
	}
	
	public void open() {
		System.out.println("开门");
	}
	
	public void close() {
		System.out.println("关门");
	}
}
