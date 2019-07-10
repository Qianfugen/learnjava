package day6;

import java.util.Arrays;

public class Example {
	public static void main(String[] args) {
		int arr[] = new int[] {1,8,9,4,5};
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr,8);
		System.out.println("13的索引位置是："+index);
	}
}
