package day12;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 编写测试类TestStudent，添加菜单，实现对学生信息的添加和列表显示操作。
 * @author 钱富根
 * @version 1.0 2019-07-17
 */
public class TestStudent {
	public static void main(String[] args) {
		StudentOperator stu = new StudentOperator();
		Scanner input= new Scanner(System.in);
		String answer = "Y";
		
		while(answer.equalsIgnoreCase("Y")) {
			//输入学生信息
			System.out.print("请输入学生姓名：");
			stu.name = input.next();
			System.out.print("请输入学生性别：");
			String gender = input.next();
			stu.sex = gender.equals("b") ? true:false;
			System.out.print("请输入学生年龄：");
			stu.age = input.nextInt();
			System.out.print("请输入学生成绩：");
			stu.score = input.nextDouble();
			
			//写入列表
			stu.add(stu.name,stu.sex,stu.age,stu.score);

			//是否继续
			System.out.println("是否继续输入学生信息（Y/N）：");
			answer=input.next();
		}
		stu.show();
		
	}
}
