package day8;

public class reverseSort {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] newArr = new int[9];
		for(int i=0;i<arr.length;i++) {
			newArr[i] = arr[arr.length-1-i];
		}
		System.out.println("原数组：");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println("\n倒序后数组：");
		for(int a:newArr) {
			System.out.print(a+" ");
		}
		
	}
}
