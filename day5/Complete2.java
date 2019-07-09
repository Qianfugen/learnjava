package day5;
import java.util.Scanner;

public class Complete2 {	
	public static void main(String[] args) {
		System.out.println("请输入您的名次");
		Scanner input = new Scanner(System.in);
		int rank = input.nextInt();
		input.close();
		switch(rank) {
		case 1:System.out.println("恭喜第一名，获得参加麻省理工夏令营一个月的资格！");
				break;
		case 2:System.out.println("奖励惠普计算机一台");
		break;
		case 3:System.out.println("奖励一个移动硬盘");
		break;
		default:System.out.println("没得奖励哦！");
		}
	}
}
