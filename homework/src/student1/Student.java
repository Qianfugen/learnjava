package student1;

/**
 * 学生实体类
 * @author 钱富根
 * @version 1.0 2019-07-26
 */

public class Student {
	//定义学生属性
	private String name;// 姓名
	private int id;// 学号
	private boolean sex;// 性别
	private int age;
	private double score;// 成绩

	//getter/setter方法
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
