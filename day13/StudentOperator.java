package day13;

public class StudentOperator {
	// 多个学生，使用类表作为存放容器
	Student[] java38;

	/**
	 * 构造静态方法
	 */
	public StudentOperator() {
		java38 = new Student[5];
	}

	/**
	 * 有参构造方法
	 */
	public StudentOperator(int count) {
		java38 = new Student[count];
	}

	/**
	 * 添加学生信息，添加成功返回1，不成功返回-1；
	 * 
	 * @param student
	 * @return
	 */
	public int addStudent(Student student) {
		int isAdd = -1;
		int index = this.searchStudent(student.getId());
		if (index == -1) {
			for (int i = 0; i < java38.length; i++) {
				if (java38[i] == null) {
					java38[i] = new Student();
					java38[i].setId(student.getId());
					java38[i].setName(student.getName());
					java38[i].setSex(student.getSex());
					java38[i].setAge(student.getAge());
					java38[i].setScore(student.getScore());

					isAdd = 1;
					break;
				}
			}
		} else { // 重复
			isAdd = 0;
		}
		return isAdd;
	}

	/**
	 * 查找学生是否存在，存在返回下标，不存在返回-1
	 * 
	 * @param id 学号
	 * @return 返回下标
	 */
	public int searchStudent(int id) {
		int index = -1;// 找到学生学号的下标，-1表示没有找到

		// 循环查找
		for (int i = 0; i < java38.length; i++) {
			if (java38[i] == null) {
				break;
			}

			// 比较学号，找到返回元素下标
			if (id == java38[i].getId()) {
				index = i;
				break;
			}
		}
		return index;
	}

	/**
	 * 打印学生列表
	 * 
	 * @param s
	 */
	public void listMenu() {
		if (java38[0] == null) {
			System.out.println("没有学生信息");
		} else {
			System.out.println("学号\t姓名\t性别\t成绩\t年龄");
			for (int i = 0; i < java38.length; i++) {
				Student student = java38[i];
				if (student == null) {
					break;
				} else {
					System.out.println(student.getId() + "\t" + student.getName() 
					+ "\t" + (student.getSex()?"男":"女") + "\t"
							+ student.getScore() + "\t" + student.getAge());
				}
			}
		}
	}

}
