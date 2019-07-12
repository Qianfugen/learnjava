package day8;
import java.util.Scanner;

public class Scores {
	public static void main(String[] args) {
		int[][] scores = new int[3][5];
		int[] classScores = new int[3];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			int total =0;
			System.out.println("**********第"+(i+1)+"个班**********************");
			for(int j=0;j<5;j++) {
				System.out.println("请输入第"+(j+1)+"个学生的成绩：");
				scores[i][j]=input.nextInt();
				total += scores[i][j];
			}
			classScores[i] = total;
		}
		System.out.println("**********成绩统计********************");
		System.out.println("1班成绩："+classScores[0]);
		System.out.println("2班成绩："+classScores[1]);
		System.out.println("3班成绩："+classScores[2]);
	}
}
