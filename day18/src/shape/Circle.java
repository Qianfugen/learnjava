package shape;

public class Circle extends Shape{
	//中心点
	private Point center;
	//半径
	private double r;
	
	/**
	 * 缺省构造方法
	 */
	public Circle() {
	}
	
	public Circle(Point center,double r) {
		this.center=center;
		this.r=r;
	}
	
	
	
	@Override
	public void draw() {
		System.out.println("draw circle at "+center.toString()+"with r "+
				r+",using color: "+getColor());
	}
	
	public double area() {
		return Math.PI*r*r;
	}
}
