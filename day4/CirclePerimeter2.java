package cn.zlxy;
import java.util.Scanner;

public class CirclePerimeter2 {
	public static void main(String[] args) {
		final float Pi = 3.14F;
		System.out.println("请输入圆的半径：");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		float perimeter = 2 * Pi * r;
		float area =  Pi * r * r;
		sc.close();
		
		System.out.println("圆的半径："+r);
		System.out.println("圆的周长："+perimeter);
		System.out.println("圆的面积："+area);
	}
}
