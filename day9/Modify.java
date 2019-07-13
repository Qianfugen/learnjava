package day9;
import java.util.Scanner;
/**
 * 数组的增删改查
 * @author root
 *
 */
public class Modify {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		System.out.println("*********数组的增删改查操作*****************************");
		System.out.println("1.数组查询");
		System.out.println("2.数组删除");
		System.out.println("3.数组修改");
		System.out.println("4.退出");
		System.out.println("*********请选择您的操作**********************************");
		
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int answer = input.nextInt();
			switch(answer) {
				case 1:System.out.println("您的操作是数组查询：");
				for(int a: arr) {
					System.out.println(a+" ");
				}
				break;
				
				case 2:System.out.println("请问您想删除第几个元素");
				int delNo = input.nextInt()-1;
				if(delNo>=0 && delNo < arr.length) {
					for(int i=delNo; i < arr.length-1;i++) {
						arr[i] = arr[i+1];
					}
				}else {
					System.out.println("请输入正确数值（0-5）");
				}
				break;
				
				case 3:System.out.println("请问您想修改第几个数：");
				int modifyNo = input.nextInt()-1;
				System.out.println("修改为何值？");
				int modifyValue = input.nextInt();
				if(modifyNo>=0 && modifyNo < arr.length) {
					arr[modifyNo] = modifyValue;
				}else {
					System.out.println("请输入正确数值（0-5）");
				}
				break;
				
				case 4:System.out.println("退出");
				System.exit(0);
				break;
				default: System.out.println("请输入正确的选项：");
				answer = input.nextInt();
			}
			System.out.println("接下来的操作是：");
		}
		System.out.println("谢谢使用！");
	}
}
