package day17;

import java.util.InputMismatchException;
import java.lang.ArithmeticException;
import java.lang.Exception;
import java.util.Scanner;

public class TestException {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		try {
			System.out.println("请输入被除数:");
			int num1=input.nextInt();
			System.out.println("请输入除数:");
			int num2=input.nextInt();
			System.out.printf("%d/%d = %d\n",num1,num2,num1/num2);
		}catch(InputMismatchException e) {
			System.out.println("输入不匹配!");
		}catch(ArithmeticException e) {
			System.out.println("除数不能为零!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("程序执行完毕!");
		}
	}
}
