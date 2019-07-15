package day10;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		String answer = "Y";
		do {
			System.out.println("请输入一个五位数：");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			if(number/10000 == number%10 && number/1000%10 == number/10%10) {
				System.out.println(number+"是一个回文数。");
			}else {
				System.out.println(number+"不是一个回文数。");
			}
			System.out.println("是否继续（Y/N）:");
			answer = input.next();
		}while(answer.equalsIgnoreCase("y"));
		System.out.println("谢谢玩耍！");
	}
}
