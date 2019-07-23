package day17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMyException{
	public static void main(String[] args) throws MyException{
		Scanner input =new Scanner(System.in);
		System.out.println("输入a的值");
		try {
		int a=input.nextInt();
		if(a==0) {
			throw new MyException("输入的值为0,GG");
		}else {
			System.out.println("end!");
		}
		}catch(InputMismatchException e) {
			System.out.println("非法字符");
		}catch(MyException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
