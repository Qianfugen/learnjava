package day22;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//
		String s1=new String();
		s1="abc";
		String s2=new String();
		s2="abc";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//常量，内存只有一份
		Scanner input=new Scanner(System.in);
		String s11="abc";
		String s22="abc";
		System.out.println(s11==s22);
		System.out.println(s11.equals(s22));
		
		//控制台输入，重新分配空间
		System.out.println("请输入s11:");
		s11=input.next();
		System.out.println("请输入s11:");
		s22=input.next();
		System.out.println(s11==s22);
		System.out.println(s11.equals(s22));
	}

}
