package test;

import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) throws MyException2 {
		Scanner input = new Scanner(System.in);

		int a;
		try {

			System.out.println("请输入a值:");
			a = input.nextInt();
//			int b=5/a;
			if (a == 0) {
				throw new MyException2("结束");
			}

		} catch (MyException2 e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("我啊哟死了");

		}

	}

}
