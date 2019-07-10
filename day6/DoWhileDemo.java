package day6;
import java.util.Scanner;

public class DoWhileDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer;
		do {
			System.out.println("上机练习");
			System.out.println("合格否（Y/N）:");
			answer = input.next();
		}while(!answer.equalsIgnoreCase("Y"));
		System.out.println("完成练习");
	}
}
