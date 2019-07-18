package day13;

/**
 * 编写测试类TestAdministrator，包含main（）方法，通过菜单实现以下功能：
 * 实现对Adminustrator类的调用，功能包含注册时要求输入密码和重复密码，
 * 两次输入密码相同才注册成功，并且修改注册标识；未注册不允许登录。
 * @author 钱富根
 * @version 3.0 2019-07-18
 */
import java.util.Scanner;

public class TestAdministrator {
	public static void main(String[] args) {
		//创建实例对象
		Administrator admin = new Administrator();
		Scanner input = new Scanner(System.in);

		// 选择操作
		int select = 0;
		do {
			//打印菜单栏
			System.out.println("1.注册\n2.登录\n0.退出");
			System.out.print("请输入您的选择：");
			select = input.nextInt();

			// 对不同操作执行相应方法
			switch (select) {
			case 1:
				//注册
				System.out.println("请输入姓名：");
				String name = input.next();
				System.out.println("请输入密码：");
				String password = input.next();
				System.out.println("请再次输入密码：");
				String password2 = input.next();
				if (password.equals(password2)) {
					admin.register(name, password);
				} else {
					System.out.println("两次密码不一致，请重新注册！");
				}
				;
				break;
			case 2:
				//登录
				System.out.println("请输入姓名：");
				String loginName = input.next();
				System.out.println("请输入密码：");
				String loginPwd = input.next();
				admin.login(loginName, loginPwd);
				break;
			case 0:
				//退出
				System.out.println("谢谢使用！");
				System.exit(0);
			}
		} while (true);
	}
}
