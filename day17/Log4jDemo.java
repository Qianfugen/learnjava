package day17;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Log4jDemo {
	// 定义日志记录器
	private static Logger logger4j = Logger.getLogger(Log4jDemo.class.getName());

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);

			System.out.print("请输入被除数:");
			int num1 = in.nextInt();

			logger4j.debug("输入被除数：" + num1);

			System.out.print("请输入除数:");
			int num2 = in.nextInt();

			logger4j.debug("输入除数：" + num2);

			System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
			System.out.println("感谢使用本程序！");
		} catch (InputMismatchException e) {
			System.out.println("输入无效，请输入整数！");
			e.printStackTrace();
			logger4j.error("输入无效，请输入整数！");
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0，请重新输入");
			e.printStackTrace();
			logger4j.error("除数不能为0，请重新输入");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("感谢使用本程序！");
			logger4j.debug("感谢使用本程序！");
		}
	}
}
