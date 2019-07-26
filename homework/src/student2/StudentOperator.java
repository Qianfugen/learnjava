package student2;

/**
 * 学生实体类
 * @author 钱富根
 * @version 1.0 2019-07-26
 */

import java.util.*;

public class StudentOperator {
	// 创建集合
	Map<Integer, Student> stdMap = new HashMap<Integer, Student>();

	/**
	 * 添加学生
	 * 
	 * @param std 学生实例
	 * @return 添加是否成功
	 */
	public boolean addStudent(Student std) {
		boolean isAdd = false;
		if (searchStudent(std.getId()) == null) {// 不存在学生
			stdMap.put(std.getId(), std);
			isAdd = true;
		} else {
			System.out.println("该学生已存在!");
		}

		return isAdd;
	}

	/**
	 * 查找学生是否重复
	 * 
	 * @param id 学生学号
	 * @return 存在返回学生实体对象,没有返回Null
	 */
	public Student searchStudent(int id) {
		Student s = null;
		if (stdMap.containsKey(id)) {
			s = stdMap.get(id);
		}
		return s;
	}

	/**
	 * 显示列表
	 */
	public void showStudent() {
		if (stdMap.size() == 0) {
			System.out.println("学生列表暂无信息!");
		} else {
			System.out.println("学号" + "\t\t" + "姓名" + "\t" + "性别" + "\t" + "年龄" + "\t" + "成绩");
			for (Student s : stdMap.values()) {
				System.out.printf("%d\t%10s\t%s\t%d\t%.2f\n", s.getId(), s.getName(), (s.isSex() ? "男" : "女"),
						s.getAge(), s.getScore());
			}
		}
	}

	/**
	 * 删除学生
	 * 
	 * @param id 学生学号
	 */
	public boolean deleteStudent(int id) {
		boolean isDel = false;
		if (searchStudent(id) != null) {
			stdMap.remove(id);
			isDel = true;
		} else {
			System.out.println("不存在该学生!");
		}

		return isDel;
	}

	/**
	 * 更新学生信息
	 * 
	 * @param std 学生对象
	 * @return 修改是否成功
	 */
	public boolean updateStudent(Student std) {
		boolean isUpdate = false;

		if (searchStudent(std.getId()) != null) {
			stdMap.put(std.getId(), std);
			isUpdate = true;
		}

		return isUpdate;
	}

	/**
	 * 查找学生
	 * 
	 * @param id 查找的学生学号
	 */
	public void findStudent(int id) {
		if (stdMap.containsKey(id)) {
			Student s = stdMap.get(id);
			System.out.println("学号:" + s.getId());
			System.out.println("姓名:" + s.getName());
			System.out.println("性别:" + (s.isSex() ? "男" : "女"));
			System.out.println("年龄:" + s.getAge());
			System.out.println("成绩:" + s.getScore());
		} else {
			System.out.println("没有该学生的信息!");
		}
	}
}
