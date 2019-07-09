package day5;
import java.util.Scanner;

/*
 * 输入赵本山的考试成绩，显示所获奖励
 * score==100,爸爸给他买车
 * score>=90,爸爸给他买mp4
 * score>=60,妈妈给他买参考书
 * score<60,爸爸妈妈混合双打
 * */
public class ScoreTest {
	public static void main(String[] args) {
		System.out.println("请输入赵本山的考试成绩：");
		Scanner input = new Scanner(System.in);
		double score = input.nextInt();
		input.close();
		if(score ==100) {
			System.out.println("爸爸给他买车");
		}else if(score>=90) {
			System.out.println("爸爸给他买mp4");
		}else if(score >=60) {
			System.out.println("妈妈给他买参考书");
		}else {
			System.out.println("爸爸妈妈混合双打");
		}
	}
}
