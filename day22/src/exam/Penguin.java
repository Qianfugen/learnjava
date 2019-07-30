package exam;

/**
 * 宠物企鹅实体类 继承Pet类
 * 
 * @author 钱富根
 * @version 1.0 2019-07-30
 */

public class Penguin extends Pet {
	private String sex;// 性别

	/**
	 * 缺省构造方法
	 */
	public Penguin() {

	}

	/**
	 * 带参构造方法
	 * 
	 * @param id 编号
	 * @param name 昵称
	 * @param health 健康值
	 * @param love 亲密度
	 * @param strain 品种
	 */
	public Penguin(int id, String name, int health, int love, String sex) {
		super(id, name, health, love);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
