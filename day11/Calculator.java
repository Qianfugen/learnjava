package day11;

/**
 * 简易计算器
 * @author 钱富根
 *@version 1.0 2019-07-16
 */

public class Calculator {	//1.定义类名
	//2.定义类的属性
	int num1;	//第一个操作数
	int num2;	//第二个操作数
	
	//3.定义方法
	
	/**
	 * 加法计算
	 */
	public void add() {
		int sum;
		sum = num1 + num2;
		System.out.println("两数相加的结果：" + sum);
	}
	
	/**
	 * 减法计算
	 */
	public void substract() {
		int sum;
		sum = num1 - num2;
		System.out.println("两数相减的结果：" + sum);
	}
	
	/**
	 * 乘法计算
	 */
	public void multiply() {
		int sum;
		sum = num1 * num2;
		System.out.println("两数相乘的结果：" + sum);
	}
	
	/**
	 * 除法计算
	 */
	public void divide() {
		if(num2 == 0) {
			System.out.println("除数不能为零！");
		}else {
			int sum;
			sum = num1 / num2;
			System.out.println("两数相除的结果：" + sum);
		}
	}
}

