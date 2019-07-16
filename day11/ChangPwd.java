package day11;
import java.util.Scanner;
/**
 * 模拟竖线用户密码管理，输入就得用户名和密码
 * 如果正确，方有权限修改；从键盘获取新的密码，进行更新
 * @author root
 *
 */
public class ChangPwd {
	String name = "qianfg";
	String pwd = "123456";
	
	public void updatePwd() {
		Scanner input = new Scanner(System.in);
		//1.输入用户名和密码
		System.out.println("请输入用户名：");
		String loginUser = input.next();
		System.out.println("请输入密码：");
		String loginPwd = input.next();
		
		//2.验证
		if(loginUser != null && loginUser.equals(name)&& loginPwd != null 
				&& loginPwd.equals(pwd)) {
			//合法用户
			//3.验证合法的用户，才能更新
			//4.输入新的密码
			///5.将新密码赋值给pwd
			System.out.println("请输入新密码");
			if(input.hasNext()) {
				String newPwd = input.next();
				System.out.println("修改密码成功，您的新密码为："+newPwd);
			}
		}else {
			//非法用户
			System.out.println("用户名或密码输入不正确！");
		}
	}
	
	public void updatePwd2(String loginUser,String loginPwd, String newPwd) {
		if(loginUser != null && loginUser.equals(name)&& loginPwd != null 
				&& loginPwd.equals(pwd)) {
			loginPwd = newPwd;
			System.out.println("修改密码成功,您的新密码为："+newPwd);
		}else {
			System.out.println("输入密码有误！");
		}
	}
	
	public static void main(String[] args) {
		ChangPwd haha = new ChangPwd();
		haha.updatePwd();
//		haha.updatePwd2("qianfg","123456","88888888");
	}
}
