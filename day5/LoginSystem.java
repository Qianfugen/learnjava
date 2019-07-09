package day5;
import java.util.Scanner;

public class LoginSystem {
	public static void main(String[] args) {
		System.out.println("---------------知领系统1.0------------------");
		System.out.println("\t\t\t1.注册");
		System.out.println("\t\t\t2.登陆");
		System.out.println("请输入您的选择（1或2）：");
		Scanner input = new Scanner(System.in);
		long passWord,passWord2;
		String USERNAME = "pipixia";
		String userName;
		if (input.hasNext()) {
			int choice = input.nextInt();
			switch(choice) {
			case 1:System.out.println("请输入用户名：");
					userName = input.next();
					System.out.println("请输入您的密码（数字）：");
					passWord = input.nextLong();
					System.out.println("请再次输入您的密码（数字）：");
					passWord2 = input.nextLong();
					while (passWord != passWord2) {
						System.out.println("密码错误，请再次输入您的密码（数字）：");
						passWord2 = input.nextLong();
					}
					System.out.println("注册成功！");
					break;
			case 2:System.out.println("请输入用户名：");
					userName = input.next();
					while (userName != USERNAME){
						System.out.println("用户名不存在，请重新输入");
						userName=input.next();
					}
					System.out.println("请输入您的密码（数字）：");
					passWord = input.nextLong();
					System.out.println("登陆成功！");
			}
		}
		input.close();
	}
}
