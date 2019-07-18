package day13;

/**
 * 学生实体类Student
 * @author 钱富根
 * @version 2.0 2019-07-17
 */
public class Student {
	//定义属性
	private int id;//学号
	private String name;//姓名
	private boolean sex;//性别
	private int age;//年龄
	private double score;//成绩
	
	/**
	 * 缺省构造方法
	 * @param id
	 */
	public Student() {
		
	}
	
	/**
	 * 带参构造方法
	 * @param id
	 * @param name
	 * @param sex
	 * @param age
	 * @param score
	 */
	public Student(int id, String name, boolean sex, int age, double score) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.score = score;
	}

	
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setSex(boolean sex) {
		this.sex=sex;
	}
	
	public boolean getSex() {
		return sex;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setScore(double score) {
		this.score=score;
	}
	
	public double getScore() {
		return score;
	}
	
}
