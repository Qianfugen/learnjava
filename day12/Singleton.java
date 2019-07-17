package day12;

public class Singleton {
	private static Singleton instance = null;

	/**
	 * 私有構造方法
	 */
	private Singleton() {

	}

	/**
	 * 静态方法，获取当前类的单例对象
	 */

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
