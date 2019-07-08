package cn.zlxy;
import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		double javaScore;
		double sqlScore;
		double mathScore;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入你的java成绩");
		javaScore = sc.nextDouble();
		
		System.out.println("请输入你的sql成绩");
		sqlScore = sc.nextDouble();
		
		System.out.println("请输入你的math成绩");
		mathScore = sc.nextDouble();
		
		double diff = (javaScore>=sqlScore) ? (javaScore-sqlScore):(sqlScore-javaScore);
		double averageScore = (javaScore+sqlScore+mathScore)/3;
		sc.close();
		
		System.out.println("java成绩："+javaScore);
		System.out.println("sql成绩："+sqlScore);
		System.out.println("math成绩："+mathScore);
		System.out.println("java成绩与sql成绩差"+diff+"分");
		System.out.printf("三门课的平均成绩：%.2f",averageScore);
	}
}
