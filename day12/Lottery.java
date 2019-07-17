package day12;

import java.util.Arrays;

/**
 * 编写一个彩票程序，产生一注或者多注双色球彩票
 * 
 * @author 钱富根
 * @version 1.0 2019-07-17
 */

public class Lottery { // 1.定义类名
	int[] luckyNum = new int[7];

	// 2.定义方法
	/**
	 */
	public void generate() {
		// 定义彩票数组，前6个为红球，最后一个为篮球

		// 产生6个红球随机数
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 33 + 1);

			// 定义是否重复的标识
			boolean isSame = false;

			// 判断当前产生的随机号码是否跟前面的号码相同
			for (int j = 0; j < i; j++) {
				if (num == luckyNum[j]) {
					isSame = true;
					break;
				}
			}
			if (!isSame) {
				luckyNum[i] = num;
			} else {
				i--;
			}
		}

		// 随机产生篮球数字
		luckyNum[6] = (int) (Math.random() * 16 + 1);
	}

	/**
	 * 采用冒泡排序对产生的彩票进行排序的方法,只排序红球
	 */
	public void sort() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				if (luckyNum[j] > luckyNum[j + 1]) {
					int temp = luckyNum[j];
					luckyNum[j] = luckyNum[j + 1];
					luckyNum[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * 打印彩票
	 */
	public void print() {
		for (int i = 0; i < luckyNum.length - 1; i++) {
			System.out.print(luckyNum[i] + "\t");
		}
		System.out.println("+" + luckyNum[luckyNum.length - 1]);

	}
}
