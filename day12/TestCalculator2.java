package day12;

import java.util.Scanner;

/**
 * 程序入口
 * @author root
 * @version 2.0 2019-07-17
 */public class TestCalculator2 {
	public static void main(String[] args) {
		//1.实例化对象
		Calculator2 cal=new Calculator2();
		Scanner input=new Scanner(System.in);
		
		int num1;
		int	num2;

		//2.给变量赋值
		System.out.print("请输入第一个操作数：");
		num1=input.nextInt();
		System.out.print("请输入第二个操作数：");
		num2=input.nextInt();
		
		//调用对象方法
		System.out.println("两个操作数相加的结果："+cal.add(num1,num2));
		System.out.println("两个操作数相减的结果："+cal.sub(num1,num2));
		System.out.println("两个操作数相乘的结果："+cal.multiply(num1,num2));
		if(num2==0) {
			cal.isZero=true;
			System.out.println("除数不能为零！");
		}else {
			System.out.println("两个操作数相除的结果："+cal.divide(num1,num2));
		}
	}
}
