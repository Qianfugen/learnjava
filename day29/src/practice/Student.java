package practice;

import java.io.Serializable;

/**
 * 学生实体类 Serializable接口:实现序列化接口
 * 
 * @author 钱富根
 * @version 1.0 2019年8月7日
 */

public class Student implements Serializable {
	private int id;// 学号
	private int age;// 年龄
	private String name;// 姓名

	/**
	 * set/get方法
	 */
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
