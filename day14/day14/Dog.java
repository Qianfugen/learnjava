package day14;

/**
 * 宠物狗类
 * @author root
 *@version 1.0 2019-07-19
 */
public class Dog {
	//定义属性
	private String name;//昵称
	private int health;//健康值
	private int love;//亲密度
	private String strain;//品种
	

	/**
	 * 缺省构造方法
	 */
	public Dog() {
		
	}
	
	/**
	 * 构造方法
	 * @param name
	 * @param health
	 * @param love
	 * @param strain
	 */
	public Dog(String name,int health,int love,String strain) {
		this.name=name;//昵称
		this.health=health;//健康值
		this.love=love;//亲密度
		this.strain=strain;//品种
	}
	
	public void print() {
		System.out.println("昵称："+name);
		System.out.println("健康值："+health);
		System.out.println("亲密度："+love);
		System.out.println("品种："+strain);
	}

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

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
}
