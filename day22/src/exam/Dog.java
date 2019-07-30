package exam;

/**
 * 宠物狗实体类 继承Pet类
 * 
 * @author 钱富根
 * @version 1.0 2019-07-30
 */
public class Dog extends Pet {
	private String strain;// 品种

	/**
	 * 缺省构造方法
	 */
	public Dog() {
		super();
	}

	/**
	 * 带参构造方法
	 * 
	 * @param id
	 * @param name
	 * @param health
	 * @param love
	 * @param strain
	 */
	public Dog(int id, String name, int health, int love, String strain) {
		super(id, name, health, love);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

}
