package day5;
import java.util.Scanner;

public class CalcAvegScore {
	public static void main(String[] args) {
		System.out.println("请依次输入五门课的成绩：");
		int sum = 0;
		Scanner input = new Scanner(System.in);
		int score;
		for (int i=1;i<=5;i++) {
			System.out.println("第"+i+"门成绩");
			score = input.nextInt();
			sum += score;
		}
		input.close();
		double AvegScore = (double)sum/5;
		System.out.println("五门课的平均成绩为："+AvegScore);
	}
}
