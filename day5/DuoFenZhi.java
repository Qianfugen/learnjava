package day5;
/*
 * 小明java考试成绩评测
 * score >=90: 优秀
 * score >=80: 良好
 * score >=70: 一般
 * score >=60: 及格
 * score <60: 不及格
 */

public class DuoFenZhi {
	public static void main(String[] args) {
		int javaScore = 61;
		if (javaScore >= 90) {
			System.out.println("优秀");
		}else if (javaScore >=80) {
			System.out.println("良好");
		}else if (javaScore >=70) {
			System.out.println("一般");
		}else if (javaScore >=60) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
	}
}
