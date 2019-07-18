package day13;

/**
 * 编写Administrator类，属性有username、password、isRegister3个；
 * 方法有register（）、login（）2个，分别实现注册和登录方法。
 * @author 钱富根
 * @version 3.0 2019-07-18
 */
import java.util.Scanner;

public class Administrator {
	// 定义私有属性
	private String username;	//用户名
	private String password;	//密码
	private boolean isRegister;	//注册状态

	/**
	 * 缺省构造方法
	 */
	public Administrator() {

	}

	/**
	 * 有参构造房方法
	 * 
	 * @param username
	 * @param password
	 * @param isRegister
	 */
	public Administrator(String username, String password, boolean isRegister) {
		this.username = username;
		this.password = password;
		this.isRegister = isRegister;
	}

	/**
	 * 私有变量setter/getter方法
	 * 
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRegister() {
		return isRegister;
	}

	public void setRegister(boolean isRegister) {
		this.isRegister = isRegister;
	}

	/**
	 * 注册方法
	 */
	public boolean register(String username, String password) {
		if (!isRegister) {
			this.username = username;
			this.password = password;
			System.out.println("注册成功！");
			isRegister = true;
		} else {
			System.out.println("您已注册，请登陆！");
		}
		return isRegister;
	}

	/**
	 * 登陆方法
	 */
	public void login(String username, String password) {
		if (isRegister) {
			if (this.username.equals(username) && this.password.equals(password)) {
				System.out.println("登陆成功");
			} else {
				System.out.println("密码错误！");
			}
		} else {
			System.out.println("您尚未注册，请先注册！");
		}
	}
}
