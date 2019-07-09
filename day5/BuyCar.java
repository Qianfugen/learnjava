package day5;

/**
 * 存款超过10000万，买迈巴赫
 * 存款超过500万，买兰博基尼
 * 存款超过200万，买奥迪A8
 * 存款超多100万，买辆帕萨特
 * 存款超过20万，买辆福特
 * 存款超过10万，要啥车，买自行车吧
 * 没钱，要啥自行车，走路吧
 * @author root
 *
 */

public class BuyCar {
	public static void main(String[] args) {
		int money = 2;
		if(money>=1000) {
			System.out.println("买迈巴赫");
		}else if (money>=500) {
			System.out.println("买兰博基尼");
		}else if (money>=200) {
			System.out.println("买奥迪A8");
		}else if (money>=100) {
			System.out.println("买辆帕萨特");
		}else if (money>=20) {
			System.out.println("买辆福特吧");
		}else if (money>=10) {
			System.out.println("要啥车，买自行车吧");
		}else {
			System.out.println("要啥自行车，走路吧");
		}
	}
}
