package day6;
/**
 * 球的弹跳
 * @author root
 *
 */

public class BallJump {
	public static void main(String[] args) {
		double height = 100.0;
		for(int i=1;i<=10;i++) {
			height *= 0.5;
			System.out.println("第"+i+"次反弹，高度为："+height+" 米");
		}
	}
}
