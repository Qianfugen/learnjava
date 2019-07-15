package day10;
import java.util.Scanner;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("请输入第"+(i+1)+"个整数：");
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("这三个整数从小到大的顺序为：");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}
