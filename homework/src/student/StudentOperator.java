package student;

public class StudentOperator {
	// 创建数组，用于存放学生信息
	Student[] studentList;

	/**
	 * 缺省构造方法
	 */
	public StudentOperator() {
		studentList = new Student[5];
	}

	/**
	 * 有参构造方法
	 * 
	 * @param counts 数组长度
	 */
	public StudentOperator(int counts) {
		studentList = new Student[counts];
	}

	/**
	 * 添加学生方法
	 * 
	 * @param s学生的实例对象
	 * @return isAdd返回-1，数组满了，返回0，重复，返回1，添加成功
	 */
	public int addStudent(Student s) {
		int isAdd = -1;
		int index = searchStudent(s.getId());
		if (index == -1) {// 没重复
			for (int i = 0; i < studentList.length; i++) {
				if (studentList[i] == null) {
					studentList[i] = new Student();
					studentList[i].setName(s.getName());
					studentList[i].setId(s.getId());
					studentList[i].setSex(s.getSex());
					studentList[i].setAge(s.getAge());
					studentList[i].setScore(s.getScore());

					isAdd = 1;
					break;
				}
			}
		} else {
			isAdd = 0;
		}
		return isAdd;
	}

	/**
	 * 构造查找重复的方法
	 * 
	 * @return 没有返回-1,有返回重复元素下标
	 */
	public int searchStudent(int id) {
		int index = -1;
		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i] == null) {
				break;
			} else if (studentList[i].getId() == id) {
				index = i;
			}
		}
		return index;
	}
	
	/**
	 * 根据学号查找学生的 信息
	 * @param id	学号
	 */
	public void findStudent(int id) {
		int index=this.searchStudent(id);
		
		//判断
		if(index==-1) {
			System.out.println("查无此人！");
		}else {
			Student s=studentList[index];
			System.out.println("查询到的学生信息如下：");
			System.out.println("学号："+s.getId());
			System.out.println("姓名："+s.getName());
			System.out.println("性别："+(s.getSex()?"男":"女"));
			System.out.println("年龄："+s.getAge());
			System.out.println("成绩："+s.getScore());
		}
	}
	
	/**
	 * 根据学号查找到对应学生并修改相应信息
	 * @param s	学生对象
	 * @return	返回是否修改成功
	 */
	public boolean updateStudent(Student s) {
		boolean isEdit=false;
		
		//查找是否有该学生
		int index=this.searchStudent(s.getId());
		
		//判断
		if(index>=0) {
			//修改相应属性值
			studentList[index] = new Student();
			studentList[index].setName(s.getName());
			studentList[index].setId(s.getId());
			studentList[index].setSex(s.getSex());
			studentList[index].setAge(s.getAge());
			studentList[index].setScore(s.getScore());
			isEdit=true;
		}
		
		return isEdit;
	}
	
	/**
	 * 删除学生信息
	 * @param id 学生学号
	 * @return 删除是否成功
	 */
	public boolean deleteStudent(int id) {
		boolean isDel =false;
		int index=searchStudent(id);
		if(index>=0) {
			int i=index;
			for(;i<studentList.length-1;i++) {
				if(studentList[i+1]==null) {
					break;
				}
				studentList[i].setName(studentList[i+1].getName());
				studentList[i].setId(studentList[i+1].getId());
				studentList[i].setSex(studentList[i+1].getSex());
				studentList[i].setAge(studentList[i+1].getAge());
				studentList[i].setScore(studentList[i+1].getScore());
				studentList[i+1]=null;
				isDel=true;
			}
		}
		
		return isDel;
	}

	public void listMenu() {
		if (studentList[0] == null) {
			System.out.println("没有学生信息！");
		} else {
			System.out.println("姓名\t学号\t性别\t年龄\t成绩");
			for (int i = 0; i < studentList.length; i++) {
				if (studentList[i] == null) {
					break;
				} else {
					Student s = studentList[i];
					System.out.println(s.getName() + "\t" + s.getId() + "\t" + (s.getSex() ? "男" : "女") + "\t"
							+ s.getAge() + "\t" + s.getScore());
				}
			}
		}
	}
}
