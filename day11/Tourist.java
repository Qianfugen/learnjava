package day11;
/**
 * 0-6岁，免费
 * 7-18岁，半价
 * 18-60，全价
 * 60以上，免费
 * @author root
 *
 */

public class Tourist {
	String name;
	int age;
	int price;
	
	public void getPrice(String name, int price, int age) {
		if(age>=0 && age <=7) {
			price =0;
		}else if(age<18) {
			price /=2;
		}else if(age>=60 && age <=130) {
			price = 0;
		}else if(age > 130) {
			System.out.println(name+"的年龄有误！");
			return;
		}
		System.out.println(name+"的票价为："+price);
	}
	
	public static void main(String[] args) {
		Tourist vi = new Tourist();
		vi.getPrice("陈想", 50, 19);
		vi.getPrice("pipixia", 50, 131);
	}
	
}
