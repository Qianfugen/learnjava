package day12.test;

public class AccessDemoTest {
	public static void main(String[] args) {
		AccessDemo access=new AccessDemo();
//		access.a=5;	//private只能本类访问
		/**
		 * 默认权限、public、protected可以被本包的其他类访问
		 */
		access.b=5;	
		access.c=5;
		access.d=5;
	}
}
