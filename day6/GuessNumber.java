package day6;
import java.util.Scanner;

/**
 * 猜数字游戏
 * @author root
 *
 */
public class GuessNumber {
	public static void main(String[] args) {
		int number = (int)(Math.random()*100);
		int guess = 0;
		int counts = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------猜数字游戏-----------------------");
		
		while (guess != number) {
			System.out.println("请输入你的数字：");
			guess = input.nextInt();
			counts++;
			
			//开始友情提示
			if(guess>number) {
				System.out.println("还大了点，再小点");
			}else if (guess<number) {
				System.out.println("小了点,再大点");
			}
			
			if(counts==1 && guess == number) {
				System.out.println("你太有才了!一次就猜中了！");
			}else if(counts <=7 && guess == number) {
				System.out.println("这么慢才猜出来，多努力!");
			}else if(counts < 10 && guess == number) {
				System.out.println("同志得多加努力啊!");
			}else if (counts>=10){
				System.out.println("小子算了吧！");
				break;
			}else {
				continue;
			}
		}
	}
}
