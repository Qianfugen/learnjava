package petmulti;

public abstract class Pet {
	//定义属性
	private String name;//昵称 设为私有属性，子类只能通过get方法获取
	protected int health;//健康值
	protected int love;//亲密度
	
	/**
	 * 缺省构造方法
	 */
	public Pet() {
		System.out.println("父类无参方法");
	}

	/**
	 * 带参构造方法
	 * @param name		昵称
	 * @param health	健康值
	 * @param love		亲密度
	 */
	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
		System.out.println("父类带参方法");
	}
	
	public void print() {
		System.out.println("昵称："+name);
		System.out.println("健康值："+health);
		System.out.println("亲密度："+love);
	}

	/*
	 * 去医院，多态
	 */
	public abstract void toHospital();
	public abstract void feed();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}
	
	

}
