package day6;
//计算100以内偶数

public class Calculate {
	public static void main(String[] args) {
		int i = 0;
		int total = 0;
		while (i<=100) {
			if (i%2==0) {
				total += i;
			}
			i++;
		}
		System.out.println("0+2+4+...+98+100 = "+total);
	}
}
