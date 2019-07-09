package day5;

public class CalculateSingle {
	public static void main(String[] args) {
		int single = 0;
		int	notSingle = 0;
		for(int i=1; i<=100;i+=2) {
			single += i;
		}
		System.out.println("1+3+5+7+...+95+97 = "+single);
		for(int i=0; i<=100;i+=2) {
			notSingle += i;
		}
		System.out.println("0+2+4+6+8+...+98+100 = "+notSingle);
	}
}
