package day12;

import java.util.Scanner;

/**
 * 测试调用Adminisrot类
 * 
 * @author 钱富根
 * @version 2.0 2019-7-17
 */
public class TestAdministor {
	public static void main(String[] args) {
		// 对象实例化
		Administor admin = new Administor();
		Scanner input = new Scanner(System.in);

		// 选择操作
		int select = 0;
		do {
			System.out.println("1.注册\n2.登录\n0.退出");
			System.out.print("请输入您的选择：");
			select = input.nextInt();

			// 对不同操作执行相应方法
			switch (select) {
			case 1:
				admin.register();
				break;
			case 2:
				admin.login();
				break;
			case 0:
				System.out.println("谢谢使用！");
				System.exit(0);
			}
		} while (true);
	}
}
