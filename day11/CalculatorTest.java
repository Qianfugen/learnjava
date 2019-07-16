package day11;

/**
 * 测试调用计算器
 * @author 钱富根
 * @version 1.0 2019-07-16
 */
public class CalculatorTest {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		//1.定义对象
		Calculator cal = new Calculator();
		
		//2.给对象的属性赋值
		cal.num1 = 13;
		cal.num2 = 0;
		
		//3.调用对象的方法
		cal.add();
		cal.substract();
		cal.multiply();
		cal.divide();
	}
}
