package homework;

import java.util.Scanner;

public class TestStudent {
	// 创建实例对象
	Scanner input = new Scanner(System.in);
	Student stu = new Student();
	StudentOperator so = new StudentOperator();

	public static void main(String[] args) {
		TestStudent ts = new TestStudent();
		ts.showMenu();
	}

	/**
	 * 打印菜单的方法
	 */
	public void showMenu() {
		int select = 0;
		do {
			// 选择菜单
			System.out.println("**************学生信息管理系统*************************");
			System.out.println("1.添加学生信息\n2.显示学生信息\n3.查询学生\n4.修改学生信息\n0.退出");
			System.out.println("请选择以上操作(0/1/2)");
			System.out.println("**************************************");
			select = input.nextInt();

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
			case 0:
				System.out.println("谢谢使用！");
				break;
			default:
				System.out.println("请输入正确选项");
				break;
			}
		} while (select != 0);
	}

	public void addMenu() {
		System.out.println("请输入学生姓名：");
		stu.setName(input.next());
		System.out.println("请输入学生学号：");
		stu.setId(input.nextInt());
		System.out.println("请输入学生性别：");
		stu.setSex(input.nextBoolean());
		System.out.println("请输入学生年龄：");
		stu.setAge(input.nextInt());
		System.out.println("请输入学生成绩：");
		stu.setScore(input.nextDouble());

		int flag = so.addStudent(stu);
		if (flag == 1) {
			System.out.println("添加成功");
		} else if (flag == 0) {
			System.out.println("列表已存在该学生信息！");
		} else if (flag == -1) {
			System.out.println("列表已满！");
		}
	}

	/**
	 * 查询学生
	 */
	public void findMenu() {
		stu=new Student();
		System.out.println("请输入查询学生学号：");
		int id=input.nextInt();
		so.findStudent(id);
	}
	
	public void updateMenu() {
		System.out.println("请输入学生姓名：");
		stu.setName(input.next());
		System.out.println("请输入学生学号：");
		stu.setId(input.nextInt());
		System.out.println("请输入学生性别：");
		stu.setSex(input.nextBoolean());
		System.out.println("请输入学生年龄：");
		stu.setAge(input.nextInt());
		System.out.println("请输入学生成绩：");
		stu.setScore(input.nextDouble());
		
		boolean flag = so.updateStudent(stu);
		
		//判断修改是否成功
		if(flag) {
			System.out.println("修改成功！");
		}else {
			System.out.println("没有该学生，修改失败！");
		}
	}
	
	public void listMenu() {
		so.listMenu();
	}

}
