package shape;

public class TestShape {
	public static void main(String[] args) {
		ShapeManager manager=new ShapeManager();
		manager.addShape(new Circle(new Point(4,4),3));
		manager.addShape(new Line(new Point(2,3),new Point(3,4),"green"));
		manager.addShape(new ArrowLine(new Point(1,2),new Point(5,5),"black",false,true));
		
		manager.draw();
	}
}
