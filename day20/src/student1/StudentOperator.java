package student1;

/**
 * 学生实体类
 * @author 钱富根
 * @version 1.0 2019-07-26
 */

import java.util.*;

public class StudentOperator {
	//创建列表
	List<Student> stdList = new ArrayList<Student>();

	/**
	 * 添加学生
	 * 
	 * @param std 学生实例
	 * @return 添加是否成功
	 */
	public boolean addStudent(Student std) {
		boolean isAdd = false;
		int index = searchStudent(std.getId());
		if (index == -1) {
			stdList.add(std);
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
	 * @return 没有重复返回-1,重复返回下标
	 */
	public int searchStudent(int id) {
		int index = -1;

		for (int i = 0; i < stdList.size(); i++) {
			if (id == stdList.get(i).getId()) {
				index = i;
				break;
			}
		}

		return index;
	}

	/**
	 * 显示列表
	 */
	public void showStudent() {
		if (!(stdList.size() > 0)) {
			System.out.println("学生列表暂无信息!");
		} else {
			System.out.println("学号" + "\t" + "姓名" + "\t" + "性别" + "\t" + "年龄" + "\t" + "成绩");
			for (int i = 0; i < stdList.size(); i++) {
				System.out.printf("%d\t%10s\t%s\t%d\t%.2f\n", stdList.get(i).getId(), stdList.get(i).getName(),
						(stdList.get(i).isSex() ? "男" : "女"), stdList.get(i).getAge(), stdList.get(i).getScore());
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
		int index = searchStudent(id);

		if (index >= 0) {
			stdList.remove(index);
			isDel = true;
		} else {
			System.out.println("无此学生!");
		}
		return isDel;
	}

	/**
	 * 更新学生信息
	 * @param std 学生对象
	 * @return 修改是否成功
	 */
	public boolean updateStudent(Student std) {
		boolean isUpdate = false;
		int index = searchStudent(std.getId());
		if (index >= 0) {
			stdList.get(index).setId(std.getId());
			stdList.get(index).setName(std.getName());
			stdList.get(index).setSex(std.isSex());
			stdList.get(index).setAge(std.getAge());
			stdList.get(index).setScore(std.getScore());
			isUpdate = true;
		}

		return isUpdate;
	}

	/**
	 * 查找学生
	 * @param id 查找的学生学号
	 */
	public void findStudent(int id) {
		int index = searchStudent(id);
		if (index >= 0) {
			System.out.println("学号:" + stdList.get(index).getId());
			System.out.println("姓名:" + stdList.get(index).getName());
			System.out.println("性别:" + (stdList.get(index).isSex() ? "男" : "女"));
			System.out.println("年龄:" + stdList.get(index).getAge());
			System.out.println("成绩:" + stdList.get(index).getScore());
		} else {
			System.out.println("没有找到!");
		}
	}
}
