package day13;

public class Ipad {
	//定义属性
	private String name;//名称
	private String shop;//商店名
	private double size;//尺寸
	private double weight;//重量
	private double price;//价格
	
	/**
	 * 缺省方法构造
	 */
	public Ipad() {
		
	}
	
	/**
	 * 带参数构造方法
	 * @param name
	 * @param shop
	 * @param size
	 * @param weight
	 * @param price
	 */
	public Ipad(String name, String shop,double size, double weight, double price) {
		this.name=name;
		this.shop=shop;
		this.size=size;
		this.weight=weight;
		this.price=price;
	}
	
	/**
	 * 设置setter/getter方法
	 */
	
	//设置名称
	public void setName(String name) {
		this.name=name;
	}
	//获取名称
	public String getName() {
		return name;
	}
	
	//设置商店名
	public void setShop(String shop) {
		this.shop=shop;
	}
	
	//获取商店名
	public String getShop() {
		return shop;
	}
	
	//设置尺寸
	public void setSize(double size) {
		this.size=size;
	}
	
	//获取尺寸
	public double getSize() {
		return size;
	}
	
	//设置重量
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	//获取重量
	public double getWeight() {
		return weight;
	}
	
	//设置价格
	public void setPrice(double price) {
		this.price=price;
	}
	
	//获取价格
	public double getPrice() {
		return price;
	}
	
}
