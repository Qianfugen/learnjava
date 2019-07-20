package pets;

public class Penguin extends Pet{
	//定义个性属性
	private String sex;
	
	public Penguin() {
		System.out.println("调用子类缺省构造方法");
	}
	
	public Penguin(String name,int health,int love,String sex) {
		super(name,health,love);//父类构造方法不能被继承，只能调用
		System.out.println("调用子类带参构造方法");
		this.sex=sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * 输出企鹅实体信息
	 */
	public void print() {
		super.print();//调用父类方法
		System.out.println("性别："+sex);
	}
}
