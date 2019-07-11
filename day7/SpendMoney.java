package day7;
import java.util.Scanner;

public class SpendMoney {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] bank = new double[5]; 
		double money;
		double sum = 0;
		for(int i=0;i<5;i++) {
			System.out.println("请输入第"+(i+1)+"笔购物金额： ");
			money = input.nextDouble();
			bank[i] = money;
			sum += money;
		}
		
		System.out.println("序号"+"\t"+"金额（元）");
		for(int j=0;j<5;j++) {
			money = bank[j];
			System.out.printf("%d\t%.2f\n",j+1,money);
		}
		System.out.println("------------------------------");
		System.out.println("总额："+sum);
	}
}
