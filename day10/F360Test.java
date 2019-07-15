package day10;
/**
 * 列出F360车辆信息
 * @author root
 *
 */
public class F360Test {
	public static void main(String[] args) {
		F360 car = new F360();
		System.out.println("********车辆信息***************");
		System.out.println("品牌："+car.brand);
		System.out.println("型号："+car.model);
		System.out.println("颜色："+car.color);
		System.out.println("价格："+car.price+"万元");
	}
}
