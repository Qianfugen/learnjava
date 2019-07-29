package map;

import java.util.*;

public class StudentOperator {
	private Map<Integer, Student> students;

	public StudentOperator() {
		students = new HashMap<Integer, Student>();
	}

	/**
	 * 插入学生
	 * 
	 * @param s 学生实体
	 * @return 添加是否成功，true添加成功，false添加不成功
	 */
	public boolean addStudent(Student s) {
		boolean isAdd = false;
		if (searchStudent(s.getId()) == null) {
			students.put(s.getId(), s);
			isAdd = true;
		}

		return isAdd;
	}

	/**
	 * 获取所有学生信息
	 * 
	 * @return 返回学生泛型集合
	 */
	public Map<Integer, Student> listStudents() {
		return students;
	}

	/**
	 * 根据学号查询学生是否存在
	 * 
	 * @param id
	 * @return 返回查找到的学生，null表示学生不存在，不为null表示学生存在
	 */
	public Student searchStudent(int id) {
		Student s = null;

		if (students.containsKey(id)) {
			s = students.get(id);
		}

		return s;
	}

	/**
	 * 修改学生信息
	 * 
	 * @param s 学生实体对象
	 * @return 返回 是否修改成功,true修改成功，false修改不成功
	 */
	public boolean updateStudent(Student s) {
		boolean isEdit = false;

		if (searchStudent(s.getId()) != null) {
			students.put(s.getId(), s);
			isEdit = true;
		}
		return isEdit;
	}

	/**
	 * 删除学生信息
	 * 
	 * @param id 学号
	 * @return 返回是否删除成功，true删除成功,false删除失败
	 */
	public boolean deleteStudent(int id) {
		boolean isDelete = false;

		if (searchStudent(id) != null) {
			students.remove(id);
			isDelete = true;
		}

		return isDelete;
	}

	public void listStudent() {
		if (students.size() == 0) {
			System.out.println("列表暂无信息");
		} else {
			System.out.println("学号" + "\t" + "姓名" + "\t" + "性别" + "\t" + "年龄" + "\t" + "成绩");
			for (Student s : students.values()) {
				System.out.println(s.getId() + "\t" + s.getName() + "\t" + ((s.isSex() ? "男" : "女")) + "\t" + s.getAge()
						+ "\t" + s.getScore());
			}
		}
	}

}
