package day6;
/**
 * 水仙花
 * @author root
 *
 */
public class Flower {
	public static void main(String[] args) {
		int num = 100;
		for(;num<1000;num++) {
			int geWei = num%10;
			int shiWei = num/10%10;
			int baiWei = num/100;
			if(Math.pow(geWei, 3)+Math.pow(shiWei, 3)+Math.pow(baiWei, 3) == num) {
				System.out.println("水仙花数："+num);
			}
		}
	}
}
