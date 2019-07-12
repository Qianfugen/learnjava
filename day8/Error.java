package day8;

import java.util.Arrays;

public class Error {
	public static void main(String[] args) {
/*
		
		int[] arr;
//		arr = {1,2,3,4,5};				//不能这样写
		
		int[] a;
		a = new int[] {1,2,3,4,5};
		
 */
		//填充数组
		System.out.println("填充数组");
		double[] scores = new double[5];
		Arrays.fill(scores, 3.8);				//填充数组
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+" ");
		}
		
		
		System.out.println("\n复制数组");
		//复制数组
		int[] num = {120,150,162,15,489};
		int[] newNum = Arrays.copyOf(num, num.length);
		for(int a:newNum) {
			System.out.print(a+" ");
		}
		//复制范围的数组
		System.out.println("\n复制范围的数组[1,4)");
		int[] newNum2 = Arrays.copyOfRange(num, 1, 4);
		for(int a:newNum2) {
			System.out.print(a+" ");
		}
		
		//排序数组
		System.out.println("\n排序数组");
		Arrays.sort(num);
		for(int a:num) {
			System.out.print(a+" ");
		}
		
		//System类方法的复制
		System.out.println("\nSystem类方法的复制");
		int[] newNum3 = new int[5];
		System.arraycopy(num, 0, newNum3, 0, 3);
		for(int a:newNum3) {
			System.out.print(a+" ");
		}
	}
}
