package practice;

import java.util.*;

/**
 * 1. 添加 2. 根据ID删除 3. 根据ID修改 4. 查询所有学生 5. 根据姓名查询学生
 * 
 * @author 钱富根
 * @version 1.0 2019年8月7日
 */

public class StudentDao {
	// 学生类集合
	List<Student> students;

	/**
	 * 缺省构造方法
	 */
	public StudentDao() {
		students = (ArrayList<Student>) ObjectIOUtil.fileToObject();
		if (students == null) {
			students = new ArrayList<Student>();
		}
	}

	/**
	 * 添加学生
	 */
	public void addStudent(Student stu) {
		students.add(stu);
		System.out.println("添加成功!");
	}

	/**
	 * 查询所有学生
	 * 
	 * @return 学生集合信息
	 */
	public List<Student> queryStudent() {
		return students;
	}

	/**
	 * 删除学生
	 * 
	 * @param id
	 */
	public void deleteStudent(int id) {
		boolean flag = false;
		for (Student s : students) {
			if (s.getId() == id) {
				students.remove(s);
				System.out.println("删除成功!");
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("没有找到该学生!");
		}
	}

	/**
	 * 根据姓名查找学生
	 * 
	 * @param name
	 */
	public Student findStudent(String name) {
		Student stu = null;
		for (Student s : students) {
			if (s.getName().equals(name)) {
				stu = s;
				break;
			}
		}
		return stu;
	}

	public void saveStudent() {
		ObjectIOUtil.objectToFile(students);
		System.out.println("保存成功!");
	}
}
