package day7;
/**
 * 斐波那契数列
 * 偶数和
 * @author root
 *
 */
public class OuShuHe {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int[] arr = new int[20];
		arr[0] = a;
		arr[1] = b;
		int i=2;
		int temp;
		
		for(;i<20;i++) {
			temp = a;
			a = b;
			b = temp+b;
			arr[i] = b;
			System.out.println("第"+(i+1)+"个"+b);
		}
		
		int sum =0;
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
			if(arr[j]%2==0) {
				sum += arr[j];
			}
		}
		System.out.println("偶数和为："+sum);
		
	}
}
