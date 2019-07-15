package day10;

public class Test2 {
	public static void main(String[] args) {
		for(int i=10;i<100;i++) {
			if(8*i<100 && 9*i>=100) {
				System.out.print("X代表的两位数为：");
				System.out.println(i);
				System.out.println("809*X = "+809*i);
			}
		}
	}
}
