package day11;

/**
 * 构建一个汽车类
 * @author root
 * @version 1.0 2019-7-16
 */
public class Car {
	//定义车的属性
	String color;		//定义车的颜色
	int weight;			//定义车的重量
	int wheels;			//定义车的轮胎数
	
	//定义车的方法
	/**
	 * 加速方法
	 */
	public void speedUp() {
		System.out.println("加速！");
	}
	
	/**
	 * 减速方法
	 */
	public void speedLow() {
		System.out.println("减速 ！");
	}
	
	/**
	 * 停车方法
	 */
	public void stop() {
		System.out.println("停车！");
	}
}
