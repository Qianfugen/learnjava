package day6;
import java.util.Arrays;

public class Dispaly {
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,8};
		Arrays.fill(arr,1,2,9);
		for(int e:arr) {
			if(e==arr[arr.length-1]){
				System.out.print(e);
			}else {
				System.out.print(e+"、");
			}
		}
	}
}
