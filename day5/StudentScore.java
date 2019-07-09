package day5;
/**
 * 3.判断学生的成绩等级
 * 如果成绩>=90分，则输出“优秀”;
 * 如果成绩>=80分，则输出“良好”;
 * 如果成绩>=60分，则输出“中等”;
 * 否则，输出“差”
 * 用if else语句
 */

public class StudentScore {
	public static void main(String[] args) {
		int score = 78;
		if (score >= 90) {
			System.out.println("优秀");
		}else if (score >=80) {
			System.out.println("良好");
		}else if (score >=60) {
			System.out.println("中等");
		}else {
			System.out.println("差");
		}
	}
}
