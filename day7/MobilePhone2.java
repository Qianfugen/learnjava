package day7;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays.sort进行排序
 * @author root
 *
 */
public class MobilePhone2 {
	public static void main(String[] args) {
		int [] prices = new int[4];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.println("第"+(i+1)+"店的价格:");
			prices[i] = input.nextInt();
		}
		Arrays.sort(prices);
		System.out.println("最低价格是："+prices[0]);
	}
}
