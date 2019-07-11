package day7;
import java.util.Scanner;

/**
 * 打擂台方式比较
 * @author root
 *
 */
public class MobliePhone {
	public static void main(String[] args) {
		System.out.println("请输入四家店的价格：");
		int[] prices = new int[5];
		int min=10000;
		Scanner input = new Scanner(System.in);
		for(int i=1;i<5;i++) {
			System.out.println("第"+i+"家店的价格：");
			prices[i] = input.nextInt();
			if(prices[i]<min) {
				min = prices[i];
			}
		}
		System.out.println("最低价格是："+min);
	}
}
