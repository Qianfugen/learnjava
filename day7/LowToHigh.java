import java.util.Arrays;
/**
 * 使用两种排序方法，将一组整数从小到大排序
 * 1.Array.sort()
 * 2.冒泡
 * @author root
 *
 */
public class LowToHigh {
	public static void main(String[] args) {
		int[] arr = {52,43,12,35,64,58};
		int[] arr2 = arr;
		//Arrays.sort()
		System.out.println("Arrays.sort:");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//冒泡
		System.out.println("冒泡");
		int temp;
		for(int i=0;i<arr2.length-1;i++) {
			for(int j=0;j<arr2.length-1-i;j++) {
				if(arr2[j]>arr2[j+1]) {
					temp = arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
