package cn.zlxy;
import java.util.Scanner;

public class CardNum {
	public static void main(String[] args) {
		System.out.println("先生/女士！请输入您的卡号(4位)：");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int amount = number;
		int sum = 0;
		for (int i=0; i<4; i++) {
			sum += amount%10;
			amount /= 10;	
		}
		input.close();
		System.out.println("您的银行卡号位： "+number+"\t各位之和位： "+sum);
	}
}
