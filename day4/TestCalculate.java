package cn.zlxy;

public class TestCalculate {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		int a = num1 % num2;
		int b = num1 / num2;
		double c = (double)num1/num2;
		System.out.println(num1 + " % " + num2 + "= " + a);
		System.out.println(num1 + " / " + num2 + " = " + b);
		System.out.println((double)num1 + " / " + num2 + " = " + c);

		num1++;
		num2--; 
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

	}
}
