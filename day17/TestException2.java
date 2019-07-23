package day17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数字");
		try {
		int a=input.nextInt();
		System.out.println("请输入数字2");
		int b=input.nextInt();
		int c=a/b;
		System.out.println("c = "+c);
		System.out.println("执行 结束");
		}catch(InputMismatchException | ArithmeticException e) {//合起来写
			System.out.println("有错误！");
			System.out.println(e.getMessage());
		}finally {//一般用于释放资源，如数据库链接、文件流等
			System.out.println("我很快乐！");
		}
	}
}
