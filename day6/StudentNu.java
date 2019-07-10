package day6;

public class StudentNu {
	public static void main(String[] args) {
		int stuNu = 80000;
		int n = 0;
		while (stuNu<200000) {
			stuNu *= 1.2;
			n++;
			System.out.println((2006+n)+"年，培训班人数"+stuNu+"人");
		}
		System.out.println((2006+n)+"年，培训班人将达到20万。");
	}
}
