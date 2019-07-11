package day7;
import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args) {
		int [] arr = {8, 4, 2, 1, 23, 344, 12};
		int sum = 0;
		
		//循环输出各元素
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]+"\n");
			}else {
			System.out.print(arr[i]+", ");
			sum += arr[i];
			}
		}
		System.out.println("数组各元素和为："+sum);
		
		//猜数字游戏
		System.out.println("猜猜数组有哪个数？");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num == 8 || num == 4 || num == 2 || num == 1 || num == 23 || num == 344 || num == 12) {
			System.out.println("猜对了！");
		}else {
			System.out.println("很遗憾，没猜对！");
		}
	}
}
