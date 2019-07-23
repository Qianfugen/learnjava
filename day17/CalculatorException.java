package day17;

import java.util.Scanner;

public class CalculatorException {
	public void divide() throws Exception{
		Scanner input = new Scanner(System.in);

		System.out.println("请输入被除数:");
		int num1 = input.nextInt();
		System.out.println("请输入除数:");
		int num2 = input.nextInt();
		System.out.printf("%d/%d = %d\n", num1, num2, num1 / num2);
	}
}
