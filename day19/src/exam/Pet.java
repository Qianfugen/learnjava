package exam;

/**
 * 宠物抽象类
 * 
 * @author 钱富根
 * @version 1.0 2019-07-25
 */
public abstract class Pet {
	protected int id;// 宠物编号
	protected String name;// 宠物姓名
	protected int health;// 宠物健康值
	protected int love;// 宠物亲密度

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
