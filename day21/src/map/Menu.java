package map;

/**
 * 学生实体类
 * @author 钱富根
 * @version 1.0 2019-07-26
 */

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import map.Student;

public class Menu {
	// 创建实例对象
	Scanner input = new Scanner(System.in);
	StudentOperator so = new StudentOperator();

	/**
	 * 打印主菜单
	 */
	public void showMenu() {
		int select = 0;
		do {
			// 选择菜单
			System.out.println("**************学生信息管理系统*************************");
			System.out.println("1.添加学生信息\n2.显示学生信息\n3.查询学生\n4.修改学生信息\n5.删除学生信息\n0.退出");
			System.out.println("请选择以上操作(0/1/2/3/4/5)");
			System.out.println("**************************************");

			// 异常捕获
			try {
				select = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("请输入数字(0/1/2/3/4/5)");
			}
			// 操作选项
			switch (select) {
			case 1:
				addMenu();
				break;
			case 2:
				listMenu();
				break;
			case 3:
				findMenu();
				break;
			case 4:
				updateMenu();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				System.out.println("谢谢使用！");
				break;
			default:
				System.out.println("请输入正确选项");
				break;
			}

		} while (select != 0);
	}

	/**
	 * 添加学生菜单
	 */
	public void addMenu() {
		// 创建学生对象
		Student stu = new Student();

		System.out.println("请输入学生姓名：");
		stu.setName(input.next());
		System.out.println("请输入学生学号：");
		stu.setId(input.nextInt());
		System.out.println("请输入学生性别(true/false)：");
		stu.setSex(input.nextBoolean());
		System.out.println("请输入学生年龄：");
		stu.setAge(input.nextInt());
		System.out.println("请输入学生成绩：");
		stu.setScore(input.nextDouble());

		boolean flag = so.addStudent(stu);
		if (flag) {
			System.out.println("添加成功!");
		} else {
			System.out.println("添加失败!");
		}
	}

	/**
	 * 查询学生菜单
	 */
	public void updateMenu() {
		// 创建学生对象
		Student stu = new Student();

		System.out.println("请输入学生姓名：");
		stu.setName(input.next());
		System.out.println("请输入学生学号：");
		stu.setId(input.nextInt());
		System.out.println("请输入学生性别(true/false)：");
		stu.setSex(input.nextBoolean());
		System.out.println("请输入学生年龄：");
		stu.setAge(input.nextInt());
		System.out.println("请输入学生成绩：");
		stu.setScore(input.nextDouble());

		boolean flag = so.updateStudent(stu);

		// 判断修改是否成功
		if (flag) {
			System.out.println("修改成功！");
		} else {
			System.out.println("没有该学生，修改失败！");
		}
	}

	/**
	 * 删除学生菜单
	 */
	public void deleteStudent() {
		System.out.println("请输入要删除学生信息的学号");
		int id = input.nextInt();
		boolean isDel = so.deleteStudent(id);
		if (isDel) {
			System.out.println("删除成功!");
		} else {
			System.out.println("删除失败!");
		}

	}

	/**
	 * 打印学生信息菜单
	 */
	public void listMenu() {
		so.listStudent();
	}

	/*
	 * 寻找学生菜单
	 */
	public void findMenu() {
		System.out.println("请输入查询学生的学号:");
		int id = input.nextInt();
		Student s=so.searchStudent(id);
		if(s!=null) {
			System.out.println("学号："+s.getId());
			System.out.println("姓名："+s.getName());
			System.out.println("性别："+(s.isSex()?"男":"女"));
			System.out.println("年龄："+s.getAge());
			System.out.println("成绩："+s.getScore());
		}else {
			System.out.println("没找到该学生！");
		}
	}

}
