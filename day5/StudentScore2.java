package day5;
/**
 3.判断学生的成绩等级，
如果成绩>=90分，则输出“优秀”;
如果成绩>=80分，则输出“良好”;
如果成绩>=60分，则输出“中等”;
否则，输出“差”
用switch-case来实现
 */

public class StudentScore2 {
	public static void main(String[] args) {
		int score = 78;
		switch(score/10) {
		case 9: System.out.println("优秀");
				break;
		case 8: System.out.println("良好");
				break;
		case 7:case 6: System.out.println("中等");
				break;
		default: System.out.println("差");
		}
	}
}
