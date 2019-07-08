package cn.zlxy;
import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学生姓名：");
		String name = input.next();
		
		System.out.print("请输入Java成绩：");
		float score = input.nextFloat();
		
		System.out.print("请输入Oracle成绩：");
		float score1 = input.nextFloat();
		
		System.out.println("请输入学生性别：");
		char gender = input.next().charAt(0);
		input.close();
		System.out.println("姓名："+name+"\tjava成绩："+score+"\toracle成绩："+score1+"\t性别："+gender);

	}
}
