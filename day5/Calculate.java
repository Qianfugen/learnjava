package day5;

public class Calculate {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<101;i++) {
			sum += i;
		}
		System.out.println("1+2+3+...+100 = "+sum);
	}
}
