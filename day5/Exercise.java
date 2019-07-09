package day5;
/*
 * 账号java成绩>=90，并且音乐成绩>=80时，
 * 或者java成绩==100，音乐成绩大于70，
 * 给予奖励
 */

public class Exercise {
	public static void main(String[] args) {
		int javaScore = 60;
		int musicScore = 85;
		if ((javaScore>=90 && musicScore>=80) || (javaScore==100 && musicScore>=70)) {
			System.out.println("棒棒哒！给与奖励！");
		}else{
			System.out.println("再接再厉！");
		}
	}
}
