package day14;

public class Cars {
	//定义类属性
	private String name;//车名
	private double site;//大小
	private int contain;//载客人数
	
	/**
	 * 缺省构造方法
	 */
	public Cars() {
		
	}
	
	/**
	 * 带参构造方法
	 * @param name
	 * @param site
	 * @param contain
	 */
	public Cars(String name, double site, int contain) {
		this.name=name;
		this.site=site;
		this.contain=contain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSite() {
		return site;
	}

	public void setSite(double site) {
		this.site = site;
	}

	public int getContain() {
		return contain;
	}

	public void setContain(int contain) {
		this.contain = contain;
	}
	
	public void print() {
		System.out.println("车名："+name);
		System.out.println("大小："+site);
		System.out.println("载客人数："+contain);
	}
}
