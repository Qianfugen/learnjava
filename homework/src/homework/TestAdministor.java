package homework;

import java.util.Scanner;

public class TestAdministor {
	// 实例化对象
	Administor admin = new Administor();
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		TestAdministor ts = new TestAdministor();
		ts.showMenu();
	}

	public void showMenu() {
		int select = 0;// 选择

		do {
			System.out.println("****************银行信息管理系统********************************");
			System.out.println("1.注册\n2.登陆\n0.退出");
			System.out.println("********************************************");
			System.out.println("请输入您的选择：");

			select = input.nextInt();

			switch (select) {
			case 1:
				System.out.println("请输入您的用户名：");
				String username = input.next();
				System.out.println("请输入密码：");
				String password = input.next();
				System.out.println("请再次输入密码：");
				String password2 = input.next();
				if (password.equals(password2)) {
					admin.register(username, password);
				} else {
					System.out.println("两次密码输入不一致！");
				}
				;
				break;
			case 2:
				System.out.println("请输入您的用户名：");
				String loginName = input.next();
				System.out.println("请输入密码：");
				String loginPwd = input.next();
				admin.login(loginName, loginPwd);
				break;
			case 0:
				System.out.println("谢谢使用！");
				break;
			default:
				System.out.println("请输入正确选项！");
				break;
			}

		} while (select != 0);

	}
}
