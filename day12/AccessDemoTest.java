package day12;

import day12.test.*;
public class AccessDemoTest {
	public static void main(String[] args) {
		AccessDemo access=new AccessDemo();
//		access.a=5;	//private只能本类访问
//		access.b=5;	//默认权限只能在同一包中访问
//		access.c=5;	//protected只能在同一包中访问
		access.d=5;	//public可以被不同包的类访问
	}
}
