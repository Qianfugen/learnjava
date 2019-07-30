package exam;

/**
 * 宠物抽象实体类
 * 
 * @author 钱富根
 * @version 1.0 2019-07-30
 */
public abstract class Pet {
	// 定义属性
	private int id;// 编号
	private String name;// 姓名
	private int health;// 健康值
	private int love;// 亲密度

	/**
	 * 缺省构造方法
	 */
	public Pet() {

	}

	/**
	 * 带参构造方法
	 * 
	 * @param id     编号
	 * @param name   姓名
	 * @param health 健康值
	 * @param love   亲密度
	 */
	public Pet(int id, String name, int health, int love) {
		this.id = id;
		this.name = name;
		this.health = health;
		this.love = love;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
