package day10;

public class Test4 {
	public static void main(String[] args) {
		int j;
		for(int i=101;i<=200;i++) {
			for(j=2;j<=Math.sqrt(i);j++) {
				if(i%j == 0) {
					break;
				}
			}
			if(j>Math.sqrt(i)) {
				System.out.println(i+"是素数！");
			}
		}
	}
}
