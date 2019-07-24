package shape;

public class TestCircle {
	public static void main(String[] args) {
		Point center=new Point(2,3);
		//创建圆,把值赋给circle
		Circle circle=new Circle(center,2);
		//调用draw方法,会执行Circle的draw方法
		circle.draw();
		//输入圆的面积
		System.out.println(circle.area());
		}
}
