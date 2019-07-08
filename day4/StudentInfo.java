package cn.zlxy;
import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//输入学生姓名
		System.out.println("输入学生姓名:");
		String name = sc.next();
		//输入学生性别
		System.out.println("输入学生性别");
		//Scanner input1 = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		//输入学生年龄
		System.out.println("输入学生年龄:");
		int age = sc.nextInt();
		//输入学生java成绩
		System.out.println("输入学生java成绩:");
		float score = sc.nextFloat();
		sc.close();
		
		
		System.out.println("--------学生信息表-------");
		System.out.println("学生姓名："+name);
		System.out.println("学生性别："+gender);
		System.out.println("学生年龄："+age);
		System.out.println("学生java成绩："+score);
	}
}
