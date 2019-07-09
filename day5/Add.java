package day5;
import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		for (int firNo=0,secNo=number;firNo<=secNo;firNo++,secNo--) {
			System.out.printf("%d + %d = %d\n",firNo, secNo, number);
		}
		System.out.println("执行完毕！");
	}
}
