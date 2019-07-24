package shape;

public class Line extends Shape {
	private Point start;
	private Point end;
	public Line(Point start,Point end,String color) {
		super(color);
		this.start=start;
		this.end=end;
	}
	
	public double length() {
		return start.distance(end);
	}
	
	public Point getStart() {
		return start;
	}
	
	public Point getend() {
		return end;
	}
	
	@Override
	public void draw() {
		System.out.println("deaw line from"+start.toString()+" to "+end.toString()+
				",using color"+getColor());
	}
}
