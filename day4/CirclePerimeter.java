package cn.zlxy;

public class CirclePerimeter {
	public static void main(String[] args) {
		final float Pi = 3.14F;
		int r = 5;
		float perimeter = 2 * Pi * r;
		float area = Pi * r * r;
		System.out.println("圆的半径： "+r+"\n圆的周长:"+perimeter+"\n圆的面积: "+area);
	}
}
