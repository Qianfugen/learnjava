package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 打印菜单类
 */
public class StudentMenu {
	StudentDao sd;

	public StudentMenu() {
		sd = new StudentDao();
	}

	public void listMenu() {
		Scanner input = new Scanner(System.in);
		int select = 0;
		do {
			System.out.println("*************学生信息管理系统******************");
			System.out.println("1.添加学生\n2.删除学生\n3.查询学生\n4.列出所有学生信息\n0.保存并退出");

			System.out.println("请输入您的选择:");
			select = input.nextInt();
			switch (select) {
			case 1:
				do {
					// 创建学生对象
					Student stu = new Student();
					System.out.println("请输入学生学号:");
					stu.setId(input.nextInt());
					System.out.println("请输入学生年龄:");
					stu.setAge(input.nextInt());
					System.out.println("请输入学生姓名:");
					stu.setName(input.next());
					// 把学生信息填入学生类集合
					sd.addStudent(stu);
					System.out.println("是否继续(0退出):");
					select = input.nextInt();
				} while (select != 0);

			
				break;
			case 2:
				System.out.println("请输入要删除的学生学号:");
				sd.deleteStudent(input.nextInt());
				break;
			case 3:
				System.out.println("请输入要查询的学生姓名:");
				Student stu=sd.findStudent(input.next());
				if(stu!=null) {
						System.out.println("找到了,信息如下:");
						System.out.println("学号:" + stu.getId());
						System.out.println("年龄:" + stu.getAge());
						System.out.println("姓名:" + stu.getName());
					}else {
						System.out.println("没有找到该学生!");
				}
				break;
			case 4:
				List<Student> stus = sd.queryStudent();
				System.out.println("---------学生信息---------");
				for (Student s : stus) {
					System.out.println("学号:" + s.getId());
					System.out.println("年龄:" + s.getAge());
					System.out.println("姓名:" + s.getName());
					System.out.println("----------------------");
				}
				break;
			case 0:
				sd.saveStudent();
				System.out.println("谢谢使用!");
			}
		}while(select!=0);
}

}
