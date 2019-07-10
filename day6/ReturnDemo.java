package day6;
import java.util.Scanner;

/**
 * 登陆系统
 * 
 * @author root
 *
 */
public class ReturnDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("****************欢迎访问本系统********************");
		System.out.println("1.注册");
		System.out.println("2.登录");
		System.out.println("3.抽奖");
		System.out.println("0.退出程序");
		String userName;
		long passWord;
		int cardId = 0;
		int luckyNo = 0;
		
		do {
			System.out.println("请选择菜单");
			if (input.hasNextInt()) {
				int choice = input.nextInt();
				switch(choice) {
				//注册
				case 1:System.out.println("请输入用户名：");
				userName = input.next();
				System.out.println("请输入密码：");
				passWord = input.nextLong();
				cardId =(int) (Math.random()*10000);
				System.out.println("注册成功，您的会员号是"+cardId);
				continue;
				
				//登陆
				case 2:System.out.println("请输入用户名：");
				userName = input.next();
				System.out.println("请输入密码：");
				passWord = input.nextLong();
				System.out.println("登陆成功");			//此处可添加密码认证
				continue;
				
				//抽奖环节
				case 3:System.out.println("抽奖环节");
				for(int i=1;i<=4;i++) {
					luckyNo = (int)(Math.random()*10000);
					if(cardId == luckyNo) {
						System.out.println("恭喜，您中奖了！");
						break;
					}else {
						System.out.println("第"+i+"次抽奖，很遗憾，没中奖！");
					}
				}
				continue;
				
				//退出
				case 0:System.out.println("谢谢使用！");
				System.exit(0);				//退出java虚拟机
				
				//重新输入
				default:System.out.println("请输入0-3之间的整数：");
				}
			}
		}while(true);
	}
}
