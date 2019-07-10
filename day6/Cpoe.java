package day6;
import java.util.Arrays;

public class Cpoe {
	public static void main(String[] args) {
		int arr[] = new int[] {12,23,45};
		int newarr[] = Arrays.copyOfRange(arr,1,2);
		for (int i=0;i<newarr.length;i++) {
			System.out.println(newarr[i]);
		}
	}
}
