package day7;
import java.util.Scanner;

/**
 * 
 * 快速排序
 * @author root
 *
 */
public class MobilePhone4 {
	public static void main(String[] args) {
		System.out.println("请输入四家店的价格：");
		int[] prices = new int[4];
		int min=10000;
		int minIndex;
		int temp;
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			System.out.println("第"+i+"家店的价格：");
			prices[i] = input.nextInt();
			}
	
	//快速排序
	for(int i=0;i<3;i++) {
		minIndex = i;
		for(int j=i+1;j<4;j++) {
			if(prices[j]<prices[minIndex]) {
				minIndex = j;				//保存最小数下标
			}
		}
		temp = prices[i];
		prices[i] = prices[minIndex];
		prices[minIndex] = temp;	
		}
	System.out.println("最便宜的价格："+prices[0]);
	}
}
