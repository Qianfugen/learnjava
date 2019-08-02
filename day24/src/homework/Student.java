package homework;

import java.util.Date;

/**
 * 学生实体类
 * 
 * @author 钱富根
 * @version 1.0 2019-07-31
 */

public class Student {
	// 定义学生属性
	private String name;// 姓名
	private int id;// 学号
	private boolean sex;// 性别
	private int age;// 年龄
	private double score;// 成绩
	private Date birthday;// 生日

	// getter/setter方法
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
