package shape;

public class Shape {
	//默认颜色
	private static final String DEFAULT_COLOR="black";
	//颜色属性
	private String color;
	
	public Shape() {
		this(DEFAULT_COLOR);
	}
	
	public Shape(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void draw() {
		System.out.println("draw shape");
	}
}
