package day22;

import java.util.Scanner;

public class TestIndexOf {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str=input.next();
		int firstindex=str.indexOf('a');
		int lastindex=str.lastIndexOf('a');
		System.out.println("第一个a："+firstindex);
		System.out.println("最后一个a："+lastindex);
	}

}
