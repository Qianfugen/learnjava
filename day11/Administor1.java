package day11;
import java.util.Scanner;

/**
 * 编写Administrator类，属性有username、password、isRegister3个；
 * 方法有register（）、login（）2个，分别实现注册和登录方法
 * @author 钱富根
 * @version 1.0 2019-7-16
 */
public class Administor1 {	//1.定义类名
	//2.定义类的属性
	String username;		//用户名
	String password;		//登录密码
	boolean isRegister;		//是否注册
	
	//3.定义类的方法
	
	/**
	 * 注册方法
	 */
	public void register() {
		if(!isRegister) {			//检查是否是已注册用户
			//输入用户名
			Scanner input = new Scanner(System.in);
			System.out.println("请输入您的用户名：");
			username = input.next();
			
			//检验两次输入密码是否一致
			do {
				//第一次输密码
				System.out.println("请输入您的密码：");
				String password1 = input.next();	
				//第二次输密码
				System.out.println("请再次输入您的密码");
				String password2 = input.next();
				
				//判断两次输入密码是否一致
				if(password1.equals(password2)) {	//密码一致，注册成功
					password = password1;
					System.out.println("注册成功");
					isRegister = true;				//用户注册成功，isRegister变为true
					break;
				}else {								//密码不一致，重新输入
					System.out.println("两次输入密码不一致，请重新输入！");
				}
			}while(true);
		}
		else {
			System.out.println("您已注册，无需再注册！");
		}
	}
	
	/**
	 * 登录方法
	 */
	public void login() {
		if(isRegister) {		//检查用户是否已注册
			Scanner input = new Scanner(System.in);

			do {
				//输入登录用户名和密码
				System.out.println("请输入您的用户名：");
				String loginName = input.next();
				System.out.println("请输入您的密码：");
				String loginPwd = input.next();
				
				//判断输入的用户名和密码是否正确
				if(loginName != null && loginName.equals(username) &&
						loginPwd != null && loginPwd.equals(password)) {
					System.out.println("登录成功！");
					break;
				}else {			//输入错误，重新登录
					System.out.println("用户名和密码错误，请重新输入！");
				}
			}while(true);
			
		}else {
			//未注册用户，跳转到注册页面进行注册
			System.out.println("您还没有注册，请先注册");
			register();
		}
	}
}
