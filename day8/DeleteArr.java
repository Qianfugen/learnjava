package day8;
import java.util.Arrays;

public class DeleteArr {
	public static void main(String[] args) {
		int[] arr = {1,0,0,4,5,0,7,8,0};
		int[] newArr = new int[arr.length];
		int j=0;
		
		//拿数组把非零数字装下
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		//找到第一个0，截取数组
		int index=0;
		for(int i=0;i<newArr.length;i++) {
			if(newArr[i]==0) {
				index=i;
				break;
			}
		}
		System.out.println("第一个零的下标是："+index);		
		int[] newArr2 = Arrays.copyOf(newArr, index);
		System.out.println("新数组：");
		for(int a:newArr2) {
			System.out.print(a+" ");
		}
	}
}
