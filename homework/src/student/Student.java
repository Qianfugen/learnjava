package student;

/**
 * Student实体类
 * 
 * @author root
 *
 */
public class Student {
	// 定义私有变量
	private String name;// 姓名
	private int id;// 学号
	private boolean sex;// 性别
	private int age;// 年龄
	private double score;// 成绩

	/**
	 * 缺省构造方法
	 */
	public Student() {
	}

	/**
	 * 有参构造方法
	 * 
	 * @param name  姓名
	 * @param id    学号
	 * @param sex   性别
	 * @param age   年龄
	 * @param score 成绩
	 */
	public Student(String name, int id, boolean sex, int age, double score) {
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.age = age;
		this.score = score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public boolean getSex() {
		return sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getScore() {
		return score;
	}
}
