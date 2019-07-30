package day22;

import java.util.Scanner;

public class TestEmail {

	public static void main(String[] args) {
		String email;
		Scanner input=new Scanner(System.in);
		int atIndex;//@位置号
		int atLastIndex;//@的位置号
		int dotIndex;//.位置
		int dotNextIndex;//.位置
		
		//输入邮箱
		System.out.println("请输入注册邮箱：");
		email=input.next();
		
		atIndex=email.indexOf('@');
		atLastIndex=email.lastIndexOf('@');
		dotIndex=email.indexOf('.');
		dotNextIndex=email.indexOf('.', dotIndex);
		
		
		if(atIndex==atLastIndex && atIndex>0 &&
				atIndex<dotIndex-1&&
				dotNextIndex!=email.length()-1&&
				(dotIndex==dotNextIndex||dotIndex<dotNextIndex-1)) {
			System.out.println("验证通过！");
		}else {
			System.out.println("验证失败！");
		}
		
	}
}
