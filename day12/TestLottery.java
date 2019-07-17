package day12;

import java.util.Scanner;

/**
 * c测试彩票程序
 * 
 * @author root
 *
 */
public class TestLottery {
	public static void main(String[] args) {
		Lottery doublecolor = new Lottery();
		Scanner input = new Scanner(System.in);
		int count;

		System.out.println("投几注彩票：");
		count = input.nextInt();
		double time1 = System.currentTimeMillis();
		for (int i = 1; i <= count; i++) {
			doublecolor.generate();
			doublecolor.sort();
			doublecolor.print();
		}
		double time2 =System.currentTimeMillis();
		System.out.println("所用时间："+(time2-time1)+"毫秒");
	}
}