package day7;

public class TestJieCheng {
	public static void main(String[] args) {
		int sum = 1;			//每个数字自个的阶乘
		int total =0;			//阶乘之和
		for(int i=1;i<=20;i++) {
			for(int j=1;j<=i;j++) {
				sum *= j;
			}
			total += sum;
			sum = 1;			//每轮循环重新赋值
		}
		System.out.println("1!+2!+3!+...+20! = "+total);
	}
}
