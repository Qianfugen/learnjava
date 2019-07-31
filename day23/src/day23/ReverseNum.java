package day23;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一串数字:");
		int num = input.nextInt();
		int a = 0;
		do {
			a = a * 10 + num % 10;
		} while ((num /= 10) != 0);
		System.out.println("倒序后的数字:" + a);
	}
}
