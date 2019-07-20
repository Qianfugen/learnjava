package pets;

public class Dog extends Pet{
	//定义个性属性
	private String strain;
	
	public Dog() {
		
	}
	
	/**
	 * 输出狗类信息
	 * @param name
	 * @param health
	 * @param love
	 * @param strain
	 */
	public Dog(String name,int health,int love,String strain) {
		super(name,health,love);
		this.strain=strain;
	}

	public String getstrain() {
		return strain;
	}

	public void setstrain(String strain) {
		this.strain = strain;
	}
	
	/**
	 * 输出企鹅实体信息
	 */
	public void print() {
		super.print();//调用父类方法
		System.out.println("品种"+strain);
	}
}
