package homework;

/**
 * 学生实体类
 * @author 钱富根
 * @version 1.0 2019-07-26
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Menu {
	// 创建实例对象
	Scanner input = new Scanner(System.in);
	StudentOperator so = new StudentOperator();

	/**
	 * 打印主菜单
	 * 
	 * @throws ParseException
	 */
	public void showMenu() throws ParseException {
		int select = 0;
		do {
			// 选择菜单
			System.out.println("**************学生信息管理系统*************************");
			System.out.println("1.添加学生信息\n2.显示学生信息\n3.查询学生\n4.修改学生信息\n5.删除学生信息\n6.读取学生信息\n7.写入学生信息\n0.退出");
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
				deleteMenu();
				break;
			case 6:
				readMenu();
				break;
			case 7:
				writeMenu();
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
	 * 
	 * @throws ParseException
	 */
	public void addMenu() throws ParseException {
		// 创建学生对象
		Student stu = new Student();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

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
		System.out.println("请输入学生生日(yyyy-MM-dd):");
		String str = input.next();
		Date date = sdf.parse(str);
		stu.setBirthday(date);

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
	public void deleteMenu() {
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
		so.showStudent();
	}

	/*
	 * 寻找学生菜单
	 */
	public void findMenu() {
		System.out.println("请输入查询学生的学号:");
		int id = input.nextInt();
		so.findStudent(id);
	}

	/**
	 * 读取学生信息文件
	 */
	public void readMenu() {
		System.out.println("请输入学生信息文件名称:");
		String file = input.next();
		so.readStudent(file);
	}

	/**
	 * 写入学生信息到文件
	 */
	public void writeMenu() {
		System.out.println("请输入要保存的文件名:");
		String filename = input.next();
		boolean flag = so.writeStudent(filename);
		if (flag) {
			System.out.println("保存文件成功!");
		} else {
			System.out.println("保存文件失败!");
		}
	}

}
