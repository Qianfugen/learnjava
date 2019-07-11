package day7;
/**
 * 冒泡排序
 * @author root
 *
 */
public class MaxAndMin {
	public static void main(String[] args) {
		int [] arr = {90,76,65,92,89,45};
		int temp;
		//从大到小
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
		System.out.println("最大值："+arr[0]+"\t最小值："+arr[arr.length-1]);
	}
}
