package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {
	private List<Student> stus;
	
	
	public StudentDao() {
		stus=(List<Student>) ObjectIOUtil.fileToObject();
		if(stus==null) {
			stus=new ArrayList<Student>();
		}
	}
	/**
	 * 写增删查改的类
	 */
	public void addStudent() {
		//先初始化存放学生的集合
//		stus=(List<Student>) ObjectIOUtil.fileToObject();
		
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			Student stu=new Student();
			System.out.println("请输入ID:");
			stu.setId(sc.nextInt());
			System.out.println("请输入年龄:");
			stu.setAge(sc.nextInt());
			System.out.println("请输入姓名:");
			stu.setName(sc.next());
			stus.add(stu);
			System.out.println("是否继续添加:");
			String flag=sc.next();
			if("no".equals(flag)) {
				break;
			}
		}
		//保存集合到文件中
		ObjectIOUtil.objectToFile(stus);
		System.out.println("添加完成.....");
	}
	/**
	 * 查询所有学生
	 */
	public List<Student> queryAllStudent() {
		stus=(List<Student>) ObjectIOUtil.fileToObject();
		return stus;
	}
	
	/**
	 * 1. 添加
	 * 2. 根据ID删除
	 * 3. 根据ID修改
	 * 4. 查询所有学生
	 * 5. 根据姓名查询学生
	 * 
	 * 预习:反射,注解
	 */
}
