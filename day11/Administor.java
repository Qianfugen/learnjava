package day11;
import java.util.Scanner;

/**
 * 编写计算机管理员登陆注册程序
 * @author root
 *
 */
public class Administor {
	String userName = "pipixia";		//用户名
	String passWord = "123456";		//用户密码
	
	//注册方法
	public void signUp() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = input.next();
		System.out.println("请输入密码：");
		String pwd = input.next();
		if(name != null && pwd != null) {
			System.out.println("注册成功！");
		}
	}
	
	//登陆方法
	public void signIn(String loginName, String loginPwd) {
		if(loginName.equals(userName) && loginPwd.equals(passWord)) {
			System.out.println("登陆成功！");
		}
	}
	
	//调用方法
	public static void main(String[] args) {
		Administor admin = new Administor();
		admin.signUp();
		admin.signIn("pipixia", "123456");
	}
}