package day6;

public class Temperature {
	public static void main(String[] args) {
		double celius = 0.0;
		double fahrenheit;
		System.out.println("**************************************************************");
		System.out.println("摄氏度\t华氏度");
		while(celius<=200) {
			fahrenheit = celius * 9 /5.0 + 32;
			System.out.println(celius+"\t"+fahrenheit);
			celius += 20.0;
		}
		System.out.println("**************************************************************");
	}
}
