package day6;
import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) {
		System.out.println("欢迎使用MyShoppong管理系统");
		System.out.println("************************************************");
		System.out.println("\t1.客户信息管理");
		System.out.println("\t2.购物结算");
		System.out.println("\t3.真情回馈");
		System.out.println("\t4.注销");
		System.out.println("************************************************");
		Scanner input = new Scanner(System.in);
		String answer = null;
		boolean flag;
		do {
			flag = true;
			System.out.println("请输入选项");
			answer =  input.next();
			switch(answer) {
			case "1":System.out.println("执行客户信息管理");
			break;
			case "2":System.out.println("执行购物结算");
			break;
			case "3":System.out.println("执行真情回馈");
			break;
			case "4":System.out.println("执行注销");
			break;
			default:System.out.println("输入错误，请重新输入:");
			flag = false;
			}
		}while(!flag);
		System.out.println("谢谢使用！");
	}
}
