package day5;
import java.util.Scanner;

public class LoginMenu {
	public static void main(String[] args) {
		System.out.println("欢迎使用我行我素购物管理系统1.0");
		System.out.println("\t\t\t1.登录系统");
		System.out.println("\t\t\t退出系统");
		System.out.println("*********************************************");
		System.out.println("请选择，输入数字(1,2)");
		Scanner input = new Scanner(System.in);
		int response = input.nextInt();
		input.close();
		switch(response) {
		case 1: System.out.println("成功进入系统");
				System.out.println("\t\t\t1.客户信息管理");
				System.out.println("\t\t\t2.购物结算");
				System.out.println("\t\t\t3.真情回馈");
				System.out.println("\t\t\t4.注销");
				break;
		case 2: System.out.println("谢谢您的使用！！！");
				break;
		default: System.out.println("输入错误");
		}
	}
}
