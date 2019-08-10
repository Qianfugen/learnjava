package day30;
/**
 * 学生实体类
 */
@SuppressWarnings("all")
public class Student{
	private int id;
	@Validate (min=1,max=100)
	private int age;
	private String name="pipixia"; 
	
	/**
	 * 缺省构造方法
	 */
	public Student() {
		
	}
	
	/**
	 * 有参构造法
	 * @param id 学号
	 * @param age 年龄
	 * @param name 姓名
	 */
	public Student(int id,int age,String name) {
		this.id=id;
		this.age=age;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	
	
}
