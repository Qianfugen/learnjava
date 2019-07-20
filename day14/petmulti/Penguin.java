package petmulti;

public class Penguin extends Pet{
	//定义独有属性
	private String sex;
	
	/**
	 * 缺省构造方法
	 */
	public Penguin() {
		System.out.println("子类企鹅的无参方法");
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 带参构造方法,方法重载
	 * @param name 		昵称
	 * @param health	健康值
	 * @param love		亲密度
	 */
	public Penguin(String name,int health,int love,String sex) {
		super(name,health,love);
		this.sex=sex;
		System.out.println("子类企鹅的带参方法");
	}
	
	/**
	 * 方法继承并改写
	 */
	public void print() {
		super.print();
		System.out.println("性别："+sex);
	}
	
	/**
	 * 子类方法，方法重写
	 */
	public void toHospital() {
		System.out.println(getName()+"企鹅需要疗养睡觉！");
	}
	public void feed() {
		System.out.println(getName()+"企鹅需要吃鱼！");
	}
	
	/**
	 * 子类独有的方法
	 */
	public void swimming() {
		System.out.println(getName()+"get游泳技能!");
	}
}
