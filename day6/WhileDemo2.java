package day6;
import java.util.Scanner;

public class WhileDemo2 {
	public static void main(String[] args) {
		System.out.println("合格了吗（Y/N）");
		Scanner input = new Scanner(System.in);
		String response = input.next();
		while (response.equalsIgnoreCase("N")) {
			System.out.println("上午阅读教材");
			System.out.println("下午上机练习");
			System.out.println("合格了吗（Y/N）");
			response = input.next();
		}
		System.out.println("完成学习任务");
	}
}
