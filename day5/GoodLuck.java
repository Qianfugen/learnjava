package day5;
import java.util.Scanner;

public class GoodLuck {
	public static void main(String[] args) {
		System.out.println("----------------幸运大抽奖！！！------------------");
		System.out.println("请输入敏德会员号(四位数)：");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		if (number/1000 == 0) {
			System.out.println("会员首位不能为零！");
		}else {
			int baiWei = (number/100)%10;
			if (baiWei == (int)(Math.random()*10)) {
				System.out.println("Good luck!你中奖了！");
			}else {
				System.out.println("很遗憾，没中奖！");
			}
		}
	}
}
