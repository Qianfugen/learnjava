package day5;
import java.util.Scanner;

public class ConsumeSavePlan {
	public static void main(String[] args) {
		System.out.println("请输入消费金额");
		Scanner input = new Scanner(System.in);
		double useMoney = input.nextDouble();
		double extra = 0.0;
		int choice = 0;
		if (useMoney >= 50) {
			System.out.println("是否参加此次换购");
			System.out.println("1.满50元，加2元换购百世可乐饮料一瓶");
			System.out.println("2.满100元，加3元换购500ml可乐一瓶");
			System.out.println("3.满100元，加10元换购5公斤面粉");
			System.out.println("4.满200元，加10元换购1个苏泊尔炒菜锅");
			System.out.println("5.满200元，加20元换购欧莱雅爽肤水一瓶");
			System.out.println("0.不换购");
			System.out.println("请选择：");
			//选择
			if (input.hasNext() == true) {
				choice = input.nextInt();
				input.close();
				switch(choice) {
				case 1:if (useMoney>=50) {
					extra =2.0;
				}
					break;
				case 2:if (useMoney>=100) {
					extra =3.0;
				}
				break;
				case 3:if (useMoney>=100) {
					extra =10.0;
				}
				break;
				case 4:if (useMoney>=200) {
					extra =10.0;
				}
				break;
				case 5:if (useMoney>=200) {
					extra =20.0;
				}
				break;
				default:extra = 0.0;
				}
			}
			
		}			
		//结账
		double total = useMoney + extra;
		System.out.println("本次消费总金额："+total);
		if (choice == 1 && useMoney>=50) {
			System.out.println("成功换购百世百事可乐一瓶");
		}else if(choice == 2 && useMoney >=100) {
			System.out.println("成功换购500ml可乐一瓶");
		}else if(choice == 3 && useMoney >=100) {
			System.out.println("成功换购5公斤面粉");
		}else if(choice == 4 && useMoney >=200) {
			System.out.println("成功换购一个苏泊尔炒菜锅");
		}else if(choice == 5 && useMoney >=200) {
			System.out.println("成功换购欧莱雅爽肤水一瓶");
		}else{
			System.out.println("没有换购");
		}
	}
}
