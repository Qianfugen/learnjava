package day14;

/**
 * 所有属性都继承Cars
 * @author root
 *
 */
public class Bus extends Cars {
	/**
	 * 缺省构造方法
	 */
	public Bus() {
		
	}
	
	/**
	 * 带参构造方法
	 * @param name
	 * @param site
	 * @param contain
	 */
	public Bus(String name, double site, int contain) {
		super(name,site,contain);
	}
	/**
	 * 方法重写
	 */
	public void print() {
		System.out.println("这是子类的方法重写！");
	}
}
