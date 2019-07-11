package day7;
import java.util.Scanner;
/**
 * 冒泡排序
 * @author root
 *
 */

public class MobilePhone3 {
	public static void main(String[] args) {
		System.out.println("请输入四家店的价格：");
		int[] prices = new int[4];
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			System.out.println("第"+(i+1)+"家店的价格：");
			prices[i] = input.nextInt();
			}
		//冒泡排序
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				if(prices[j]>prices[j+1]) {
					int temp = prices[j+1];
					prices[j+1] = prices[j];
					prices[j] = temp;
				}
			}
		}
		System.out.println("最低价格是："+prices[0]);
	}
}
