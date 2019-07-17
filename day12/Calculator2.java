package day12;

/**
 * 简易计算器程序
 * 
 * @author root
 *
 */
public class Calculator2 {
	//除数是否为零
	boolean isZero;
	
	/**
	 * 两个数相加
	 * 
	 * @param num1 加数1
	 * @param num2 加数2
	 * @return
	 */
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * 两个数相减
	 * 
	 * @param num1 减数1
	 * @param num2 减数2
	 * @return
	 */
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	/**
	 * 两个数相乘
	 * 
	 * @param num1 乘数1
	 * @param num2 乘数2
	 * @return
	 */
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	/**
	 * 两个数相除
	 * 
	 * @param num1 除数1
	 * @param num2 除数2
	 * @return
	 */
	public int divide(int num1, int num2) {
		return num1 - num2;
	}
}
