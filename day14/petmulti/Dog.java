package petmulti;

public class Dog extends Pet{
	//定义独有属性
	private String strain;
	
	/**
	 * 缺省构造方法
	 */
	public Dog() {
		System.out.println("子类狗的无参方法");
	}
	
	/**
	 * 狗类方法，方法重载
	 * @param name
	 * @param health
	 * @param love
	 */
	public Dog(String name,int health,int love,String strain) {
		super(name,health,love);//调用父类带参方法，不写隐式调用缺省方法
		System.out.println("子类狗的带参方法");
		this.strain=strain;
	}
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	/**
	 * 方法继承并改写
	 */
	public void print() {
//		super.print();不调用父类方法
		System.out.println("品种："+strain);
	}
	
	/**
	 * 抽象类方法
	 */
	public void toHospital() {
		System.out.println(getName()+"狗狗需要打针吃药！");
	}
	public void feed() {
		System.out.println(getName()+"狗狗需要吃肉！");
	}
	
	
	/**
	 * 改写父类Object类的toString方法
	 */
	public String toString() {
		return "我是"+getName()+"，谢谢主人把我养大！";
	}
	
	/**
	 * 重写equals方法
	 * @param d
	 * @return
	 */
	public boolean equals(Dog d) {
		if(this.getName().equals(d.getName())) {
			return true;
		}else {
			return false;
		}
	}
	
	public void catchingFlyDisk() {
		System.out.println(getName()+"get抓飞盘技能！");
	}
}
