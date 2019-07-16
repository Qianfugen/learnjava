package day11;
import java.util.Scanner;

/**
 * 测试调用Adminisrot类
 * @author 钱富根
 * @version 1.0 2019-7-16
 */
public class Administor1Test {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		//1.创建对象
		Administor1 admin = new Administor1();
		
		//2.定义对象的属性
		admin.isRegister = false;
		
		//3.调用对象的方法
		admin.register();
		admin.login();
	}
}
