package day5;
import java.util.Scanner;

public class MyShopping {
	public static void main(String[] args) {
		System.out.println("MyShopping管理系统 >购物结算");
		System.out.println("************************************************");
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("请输入商品序号：");
			System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
			System.out.println("********************************************");
			String choice = input.next();
			if (choice.equals("1")) {
				System.out.println("T恤\t￥245.0");
			}else if (choice.equals("2")) {
				System.out.println("网球鞋\t￥380.0");
			}else{
				System.out.println("网球拍\t￥520.0");
			}
			System.out.println("是否继续（y/n）:");
			choice = input.next();
			if (choice.equalsIgnoreCase("n")) {
				System.out.println("程序结束！");
				break;
			}
		}
		input.close();
	}
}
