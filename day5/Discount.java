package day5;
import java.util.Scanner;

/**
 * 普通顾客满100打9折
 * 会员购物打八折，满200打七五折
 * @author root
 *
 */
public class Discount {
	public static void main(String[] args) {
		double pay;
		Scanner input = new Scanner(System.in);
		System.out.println("您是否是会员（Y/N）：");
		char response = input.next().charAt(0);
		System.out.println("请输入您的消费金额: ");
		double useMoney = input.nextDouble();
		input.close();
		
		if (response == 'Y' ) {				//会员价
			if (useMoney >=200) {
				pay = useMoney * 0.75;			//满200打75折
				System.out.println("满200，打七五折后实付金额："+pay);
			}else if (useMoney < 200) {
				pay = useMoney * 0.8;			//打8折
				System.out.println("打8折后实付金额："+pay);
			}
		}else {
			if (useMoney>=100) {				//普通顾客满100打九折				pay = useMoney * 0.9;
				pay=useMoney*0.9;
				System.out.println("消费满100，打九折："+pay);
			}else if (useMoney<=0) {
				System.out.println("一毛都不花，打骨折");
			}else {								//没有优惠
				pay = useMoney;
				System.out.println("您此次共消费："+pay);
			}
		}
	}
}
