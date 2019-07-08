package cn.zlxy;

public class Encryption {
	public static void main(String[] args) {
		int data = 100;
		int result = (data*10+5)/2 + (int)3.14159;
		System.out.println("加密前数字："+data);
		System.out.println("加密后数字："+result);
	}
}
