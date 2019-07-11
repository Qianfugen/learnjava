package day7;
import java.util.Scanner;

public class GuessNum2 {
	public static void main(String[] args) {
		int [] numbers = {1,2,3,8,9};
		int num;
		int counts = 0;
		int guessLimit = 5;
		System.out.println("猜猜数组有哪个数");
		Scanner input = new Scanner(System.in);
		while(counts<guessLimit) {
			counts++;
			num = input.nextInt();
			for(int i=0;i<numbers.length;i++) {
				if(num == numbers[i]) {
					System.out.println("猜对了，真厉害！");
					return;
				}
			}
			if(counts<guessLimit) {
				System.out.println("再试试！");
			}else {
				System.out.println("没机会了，拜拜！");
			}
		}
	}
}
