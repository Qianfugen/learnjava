package day11;

/**
 * 测试调用Car类
 * @author root
 * @version 1.0 2019-7-16
 */
public class CarTest {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		//1.定义对象
		Car car = new Car();
		
		//2.给对象属性赋值
		car.color = "黄色";
		car.wheels = 4;
		car.weight = 6;
		
		//3.调用对象方法
		car.speedUp();
		car.speedLow();
		car.stop();
	}
	
}
