package day12;

import java.util.Scanner;

/**
 * 编写Administrator类，属性有username、password、isRegister3个；
 * 方法有register（）、login（）2个，分别实现注册和登录方法
 * 
 * @author 钱富根
 * @version 2.0 2019-7-17
 */
public class Administor { // 1.定义类名
	// 2.定义类的属性
	String username; // 用户名
	String password; // 登录密码
	boolean isRegister; // 是否注册

	// 3.定义类的方法

	/**
	 * 注册方法
	 */
	public void register() {
		if (!isRegister) { // 检查是否是已注册用户
			// 定义局部变量
			String password1;
			String password2;

			// 定义一个输入器
			Scanner input = new Scanner(System.in);

			// 输入用户名
			System.out.println("请输入您的用户名：");
			username = input.next();

			// 检验两次输入密码是否一致
			// 第一次输密码
			System.out.print("请输入您的密码：");
			password1 = input.next();
			// 第二次输密码
			System.out.print("请再次输入您的密码");
			password2 = input.next();

			// 判断两次输入密码是否一致
			if (password1.equals(password2)) { // 密码一致，注册成功
				password = password1;
				System.out.println("注册成功");
				isRegister = true; // 用户注册成功，isRegister变为true
			} else { // 密码不一致，重新输入
				System.out.println("两次输入密码不一致，请重新输入！");
			}
		} else {
			System.out.println("您已注册，无需再注册！");
		}
	}

	/**
	 * 登录方法
	 */
	public void login() {
		if (isRegister) { // 检查用户是否已注册
			// 定义局部变量
			String loginName;
			String loginPwd;

			// 定义一个输入器
			Scanner input = new Scanner(System.in);

			// 输入登录用户名和密码
			System.out.println("请输入您的用户名：");
			loginName = input.next();
			System.out.println("请输入您的密码：");
			loginPwd = input.next();

			// 判断输入的用户名和密码是否正确
			if (loginName.equals(username) && loginPwd.equals(password)) {
				System.out.println("登录成功！");
			} else { // 输入错误，重新登录
				System.out.println("用户名和密码错误，请重新输入！");
			}

		} else {
			System.out.println("您还没有注册，请先注册");
		}
	}
}
