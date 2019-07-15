package day10;
/**
 * 创建狗类
 * @author root
 *
 */
public class Dog {
	String name;		//狗的姓名属性
	String color;		//狗的颜色属性
	//狗的吃的方法
	public void eat() {
		System.out.println(name + "在吃");
	}
	//狗的狂吠的方法
	public void bark() {
		System.out.println(name + "在叫");
	}
	
	//狗的跑的方法
	public void run() {
		System.out.println(name+"在跑");
	}
	
	//狗的发动方法
	public void start() {
		System.out.println("狂奔吧"+name);
	}
	//狗的停止方法
	public void stop() {
		System.out.println("stop,傻狗"+name);
	}
	//狗的加速方法
	public void speedup() {
		System.out.println("加速！前面有小偷！"+name+"，快追上他！");
	}
}
