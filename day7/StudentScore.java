package day7;
import java.util.Scanner;
import java.util.Arrays;
/**
 * 第一题学生成绩
 * @author root
 *
 */
public class StudentScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] scores = new int[5];
		int sum = 0;
		for(int i=1;i<=5;i++) {
			System.out.println("请输入第"+i+"位同学的成绩：");
			scores[i-1]=input.nextInt();
			sum += scores[i-1];
		}
		Arrays.sort(scores);
		int highestScore = scores[scores.length-1];
		int lowestScore = scores[0];
		double avegScore = sum/5.0;
		System.out.printf("最高分：%d, 最低分%d, 平均分：%.2f", highestScore,lowestScore,avegScore);
	}
}
