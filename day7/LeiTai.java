package day7;
import java.util.Scanner;

/**
 * 输入一组成绩最大的
 * @author root
 *
 */
public class LeiTai {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] scores = new int[5];
		int max = 0;
		for(int i=0;i<5;i++) {
			System.out.println("请输入第"+(i+1)+"个学生的成绩：");
			scores[i] = input.nextInt();
			if(scores[i]>max) {
				max = scores[i];
			}
		}
		System.out.println("最高成绩是："+max);
	}
}
