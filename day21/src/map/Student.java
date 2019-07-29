package map;

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
	
	/**
	 * 缺省构造方法
	 */
	public Student() {
		
	}
	
	/**
	 * 带参构造方法
	 * @param name 姓名
	 * @param id 学号
	 * @param sex 性别
	 * @param age 年龄
	 * @param score 成绩
	 */
	public Student(String name,int id,boolean sex,int age,double score){
		this.name=name;
		this.id=id;
		this.sex=sex;
		this.age=age;
		this.score=score;
	}

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
