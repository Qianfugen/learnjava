package pets;

/**
 * 宠物狗类
 * @author root
 *@version 1.0 2019-07-19
 */
public class Pet {
	//定义属性
	private String name;//昵称
	private int health;//健康值
	private int love;//亲密度
	

	/**
	 * 缺省构造方法
	 */
	public Pet() {
		System.out.println("调用父类缺省构造方法");
	}
	
	/**
	 * 构造方法
	 * @param name
	 * @param health
	 * @param love
	 */
	public Pet(String name,int health,int love) {
		System.out.println("调用父类带参构造方法");
		this.name=name;//昵称
		this.health=health;//健康值
		this.love=love;//亲密度
	}
	
	public void print() {
		System.out.println("昵称："+name);
		System.out.println("健康值："+health);
		System.out.println("亲密度："+love);
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

}
