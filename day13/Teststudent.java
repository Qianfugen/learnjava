package day13;

import java.util.Scanner;

public class Teststudent {
	Scanner input = new Scanner(System.in);
	StudentOperator so = new StudentOperator(5);
	Student stu = new Student();

	public static void main(String[] args) {
		Teststudent ts = new Teststudent();
		ts.showMenu();

		Student s;
		s = new Student();

	}

	public void showMenu() {
		int select = 0;
		do {
			// 打印菜单
			System.out.println("***********学生信息管理系统*********************");
			System.out.println("1.添加学生信息");
			System.out.println("2.显示学生列表");
			System.out.println("0.退出");
			System.out.println("请输入您的选择（0/1/2）");
			select = input.nextInt();
			switch (select) {
			case 1:
				addMenu();
				break;
			case 2:
				listMenu();
				break;
			case 0:
				System.out.println("谢谢使用！");
				break;
			default:
				System.out.println("选择错误！请重新输入");
			}
		} while (select != 0);

	}

	public void addMenu() {
		// 人机交互
		System.out.println("添加学生：");
		System.out.println("请输入学生学号：");
		stu.setId(input.nextInt());
		System.out.println("请输入学生姓名：");
		stu.setName(input.next());
		System.out.println("请输入学生性别：");
		stu.setSex(input.nextBoolean());
		System.out.println("请输入学生年龄：");
		stu.setAge(input.nextInt());
		System.out.println("请输入学生成绩：");
		stu.setScore(input.nextDouble());

		// 调用操作类的方法
		int flag = so.addStudent(stu);

		// 判断添加成功与否
		if (flag == 1) {
			System.out.println("添加成功！");
		} else if (flag == 0) {
			System.out.println("添加失败，学号重复！");
		} else if (flag == -1) {
			System.out.println("添加失败，数组已满！");
		}

	}

	public void listMenu() {
		so.listMenu();
	}
}
